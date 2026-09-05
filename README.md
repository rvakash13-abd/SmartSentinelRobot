<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&amp;height=260&amp;color=0:012A2D,25:014D40,60:0B6E4F,100:08D9A5&amp;text=Smart Sentinel Robot &amp;fontSize=68&amp;fontColor=E8FFF7&amp;fontAlignY=38&amp;animation=fadeIn&amp;desc=AI-Powered%20Smart%20Medicine%20Vending%20Machine&amp;descAlignY=60&amp;descColor=B7FFE8&amp;descSize=17"/>

</div>

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Share+Tech+Mono&amp;weight=700&amp;size=19&amp;pause=1500&amp;color=08D9A5&amp;center=true&amp;vCenter=true&amp;width=750&amp;lines=SAFE+%7C+SECURE+%7C+24x7+MEDICINE+DISPENSING;AI-BASED+PRESCRIPTION+VERIFICATION;ZERO-ERROR+AUTOMATED+DISPENSING;IoT-CONNECTED+SMART+HEALTHCARE+KIOSK"/>

</div>

<div align="center">

<img src="https://img.shields.io/badge/Status-Prototype_Built-08D9A5?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Controller-Arduino_Uno_%E2%86%92_ESP32-014D40?style=for-the-badge"/>
<img src="https://img.shields.io/badge/License-MIT-012A2D?style=for-the-badge"/>

</div>

<div align="center">

<a href="https://github.com/rvakash13-abd">
<img src="https://img.shields.io/badge/GitHub-012A2D?style=for-the-badge&amp;logo=github&amp;logoColor=08D9A5"/>
</a>
<a href="mailto:r.v.akash13@gmail.com">
<img src="https://img.shields.io/badge/Contact-Gmail-014D40?style=for-the-badge&amp;logo=gmail&amp;logoColor=E8FFF7"/>
</a>

</div>

<br>

<div align="center">

```text
        ┌───────────────────────┐
        │      ┌───────────┐    │
        │      │  ▓▓▓▓▓▓▓  │    │   ██████╗  ██╗
        │      │  ▓ Rx OK ▓  │    │   ██╔══██╗██║
        │      │  ▓▓▓▓▓▓▓  │    │   ██████╔╝██║
        │      └───────────┘    │   ██╔══██╗╚═╝
        │   [A1][A2][A3][A4]     │   ██║  ██║██╗
        │   [B1][B2][B3][B4]     │   ╚═╝  ╚═╝╚═╝
        │   [C1][C2][C3][C4]     │
        │                        │
        │      ┌──────────┐      │      M E D E X
        │      │  PAY 💳  │      │  Smart Medicine
        │      └──────────┘      │  Vending Machine
        │      ═[ DISPENSE ]═    │
        └───────────────────────┘
             MEDEX  •  24×7
```

</div>

---

## 🩺 About the Project

**MEDEX** is an AI-powered Smart Medicine Vending Machine built to provide **safe, secure, and 24×7 access to medicines**. The system reads and verifies prescriptions using **AI-based OCR**, with **manual verification by authorized personnel** available as a fallback. It checks **prescription expiry**, processes **digital payments**, and **dispenses only authorized medicines** — automatically, accurately, and without human handling.

> **Elevator Pitch:** MEDEX is an AI-powered Smart Medicine Vending Machine that verifies prescriptions, checks prescription validity, and automatically dispenses authorized medicines. It combines AI, automation, IoT, and digital payments to provide safe, reliable, and 24×7 medicine access.

A working **prototype** has been built using an **Arduino Uno**. The planned **commercial version** upgrades to an **ESP32-based controller** with a **touchscreen interface, additional sensors, and IoT connectivity** for real-time inventory monitoring and remote management.

---

## 📌 Table of Contents

- [Key Features](#-key-features)
- [How It Works](#-how-it-works)
- [System Architecture](#-system-architecture)
- [Tech Stack](#-tech-stack)
- [Prototype vs Commercial](#-prototype-vs-commercial)
- [Use Cases](#-use-cases)
- [Project Status](#-project-status)
- [Getting Started](#-getting-started)
- [Future Scope](#-future-scope)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

---

## 🚀 Key Features

| Feature | Description |
|---|---|
| 🤖 **AI-Based OCR Verification** | Automatically reads and validates prescriptions from images/scans |
| 👨‍⚕️ **Manual Verification Fallback** | Authorized personnel can manually approve unclear or flagged cases |
| ⏳ **Expiry Validation** | Rejects expired or invalid prescriptions before dispensing |
| 💳 **Digital Payments** | Secure, cashless transactions integrated into the dispensing flow |
| 📦 **Automated Dispensing** | Dispenses only verified, authorized medicines — no manual handling |
| 🌐 **IoT Connectivity** | Real-time inventory monitoring and remote management |
| 🖥️ **Touchscreen Interface** | Simple, guided user interaction (commercial version) |
| 🕐 **24×7 Availability** | Always-on access to essential medicines |

---

## ⚙️ How It Works

```text
[1] User scans / uploads a prescription at the kiosk
[2] AI OCR engine extracts and reads prescription details
[3] System validates authenticity, medicine list, and expiry date
[4] Unclear or flagged cases → routed to Manual Verification (Authorized Personnel)
[5] User completes secure Digital Payment
[6] Controller (Arduino Uno / ESP32) triggers the Dispensing Mechanism
[7] IoT module updates inventory in real time for remote monitoring
```

---

## 🏗️ System Architecture

```text
User → Prescription Input (Scan/Upload)
          │
          ▼
   AI OCR Verification ──► (Fail/Unclear) ──► Manual Verification (Authorized Personnel)
          │
          ▼
   Expiry & Authorization Check
          │
          ▼
     Digital Payment Gateway
          │
          ▼
   Controller (Arduino Uno / ESP32) → Dispensing Mechanism
          │
          ▼
   IoT Module → Real-Time Inventory Sync & Remote Monitoring
```

---

## 🧰 Tech Stack

<div align="center">

![Arduino](https://img.shields.io/badge/Arduino_Uno-014D40?style=for-the-badge)
![ESP32](https://img.shields.io/badge/ESP32-014D40?style=for-the-badge)
![Python](https://img.shields.io/badge/Python-014D40?style=for-the-badge)
![OpenCV](https://img.shields.io/badge/OCR_Engine-014D40?style=for-the-badge)
![IoT](https://img.shields.io/badge/IoT-014D40?style=for-the-badge)
![Embedded C](https://img.shields.io/badge/Embedded_C-014D40?style=for-the-badge)
![Touchscreen](https://img.shields.io/badge/Touchscreen_UI-014D40?style=for-the-badge)
![Payments](https://img.shields.io/badge/Digital_Payments-014D40?style=for-the-badge)

</div>

- **AI / OCR:** AI-based Optical Character Recognition for reading and validating prescriptions
- **Prototype Controller:** Arduino Uno
- **Commercial Controller:** ESP32 (Wi-Fi / IoT enabled)
- **Interface:** Touchscreen display (commercial version)
- **Connectivity:** IoT for real-time inventory monitoring & remote management
- **Payments:** Digital payment gateway integration
- **Sensors:** Dispensing and inventory-tracking sensors

*(Update this section with the exact languages, frameworks, and libraries actually used in your implementation.)*

---

## 🔩 Prototype vs Commercial

| Component | 🧪 Prototype | 🏭 Commercial Version |
|---|---|---|
| Controller | Arduino Uno | ESP32 |
| Display | — | Touchscreen |
| Connectivity | — | Wi-Fi / IoT |
| Sensors | Basic dispensing sensors | Advanced dispensing + inventory sensors |
| Payment Module | — | Integrated digital payment gateway |
| Monitoring | Manual/local | Real-time remote monitoring |

---

## 🏥 Use Cases

<div align="center">

| 🏥 Hospitals | 💊 Pharmacies | 🌾 Rural Areas | 🚨 Emergencies |
| :---: | :---: | :---: | :---: |
| Reduce pharmacist workload | Extend service hours | Bring medicine access closer | Immediate 24×7 access |

</div>

---

## 📍 Project Status

```text
[DONE]         Prototype built using Arduino Uno
[DONE]         AI-based OCR prescription verification (prototype stage)
[DONE]         Manual verification fallback
[IN PROGRESS]  ESP32-based commercial controller
[PLANNED]      Touchscreen UI integration
[PLANNED]      Full IoT-based remote inventory monitoring
[PLANNED]      Digital payment gateway integration
[PLANNED]      Field pilot / deployment testing
```

*(Adjust to reflect your actual current progress.)*

---

## 🛠️ Getting Started

```bash
# Clone the repository
git clone https://github.com/rvakash13-abd/medex.git
cd medex

# (Prototype) Flash the Arduino firmware
# Open /firmware/medex_arduino.ino in Arduino IDE and upload to Arduino Uno

# (AI/OCR module) Install dependencies
pip install -r requirements.txt

# Run the OCR/verification module
python ocr_verification.py
```

---

## 🔮 Future Scope

- AI-based dosage and drug-interaction warnings
- Facial / ID-based patient authentication
- Integration with hospital and pharmacy management systems
- Multi-language support for wider accessibility
- Predictive inventory restocking using usage analytics

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

<div align="center">

<a href="https://github.com/rvakash13-abd">
<img src="https://img.shields.io/badge/GITHUB-012A2D?style=for-the-badge&amp;logo=github&amp;logoColor=08D9A5"/>
</a>
<a href="mailto:r.v.akash13@gmail.com">
<img src="https://img.shields.io/badge/EMAIL-014D40?style=for-the-badge&amp;logo=gmail&amp;logoColor=E8FFF7"/>
</a>

<br><br>

**Akash R V** — r.v.akash13@gmail.com

If you find this project useful, consider giving it a ⭐ on GitHub!

</div>

<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&amp;color=0:012A2D,50:014D40,100:08D9A5&amp;height=120&amp;section=footer"/>

</div>
