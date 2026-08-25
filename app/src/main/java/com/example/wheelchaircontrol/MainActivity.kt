package com.example.bluetoothconnect

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException
import java.io.OutputStream
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnConnect: Button
    private lateinit var btnTemp: Button
    private lateinit var btnAuto: Button
    private lateinit var btnVacOn: Button
    private lateinit var btnVacOff: Button
    private lateinit var btnForward: Button
    private lateinit var btnBackward: Button
    private lateinit var btnLeft: Button
    private lateinit var btnRight: Button
    private lateinit var btnStop: Button
    private lateinit var tvStatus: TextView

    private var bluetoothAdapter: BluetoothAdapter? = null
    private var bluetoothSocket: BluetoothSocket? = null
    private var outputStream: OutputStream? = null

    private val HC05_MAC = "00:25:03:31:0E:85"
    private val uuid =
        UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConnect = findViewById(R.id.btnConnect)
        btnTemp = findViewById(R.id.btnTemp)
        btnAuto = findViewById(R.id.btnAuto)
        btnVacOn = findViewById(R.id.btnVacOn)
        btnVacOff = findViewById(R.id.btnVacOff)
        btnForward = findViewById(R.id.btnForward)
        btnBackward = findViewById(R.id.btnBackward)
        btnLeft = findViewById(R.id.btnLeft)
        btnRight = findViewById(R.id.btnRight)
        btnStop = findViewById(R.id.btnStop)
        tvStatus = findViewById(R.id.tvStatus)

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        btnConnect.setOnClickListener { connectBluetooth() }

        // Core Robot Commands
        btnTemp.setOnClickListener { sendCommand("1") }
        btnAuto.setOnClickListener { sendCommand("2") }
        btnVacOn.setOnClickListener { sendCommand("3") }
        btnVacOff.setOnClickListener { sendCommand("4") }

        // Manual Movement
        btnForward.setOnClickListener { sendCommand("f") }
        btnBackward.setOnClickListener { sendCommand("b") }
        btnLeft.setOnClickListener { sendCommand("l") }
        btnRight.setOnClickListener { sendCommand("r") }
        btnStop.setOnClickListener { sendCommand("s") }
    }

    private fun connectBluetooth() {

        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth not supported", Toast.LENGTH_SHORT).show()
            return
        }

        if (!bluetoothAdapter!!.isEnabled) {
            startActivity(Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE))
            return
        }

        try {
            val device: BluetoothDevice =
                bluetoothAdapter!!.getRemoteDevice(HC05_MAC)

            bluetoothSocket =
                device.createRfcommSocketToServiceRecord(uuid)

            bluetoothSocket!!.connect()
            outputStream = bluetoothSocket!!.outputStream

            tvStatus.text = "Connected to HC‑05"
        } catch (e: IOException) {
            tvStatus.text = "Connection Failed"
            Toast.makeText(this, "Bluetooth connection failed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun sendCommand(cmd: String) {
        try {
            outputStream?.write(cmd.toByteArray())
            tvStatus.text = "Sent: $cmd"
        } catch (e: IOException) {
            tvStatus.text = "Send Failed"
        }
    }
}
