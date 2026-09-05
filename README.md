<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&height=260&color=0:0A0F1E,25:14213D,60:1B3A5C,100:2CB1BC&text=SMART%20SENTINEL%20ROBOT&fontSize=42&fontColor=E8FBFF&fontAlignY=38&animation=fadeIn&desc=Offline%20Autonomous%20%2B%20App-Controlled%20Cleaning%20%26%20Safety%20Robot&descAlignY=62&descColor=B8ECFF&descSize=15"/>

</div>

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Share+Tech+Mono&weight=700&size=18&pause=1500&color=2CB1BC&center=true&vCenter=true&width=780&lines=OFFLINE+AUTONOMOUS+NAVIGATION;OBSTACLE+AVOIDANCE+%2B+HUMAN+DETECTION;VACUUM-BASED+SMART+CLEANING;BLUETOOTH+APP+CONTROL+%E2%80%94+NO+INTERNET+NEEDED"/>

</div>

<div align="center">

<img src="https://img.shields.io/badge/Status-Prototype_Built-2CB1BC?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Controller-Arduino_Uno-14213D?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Patent-Application_Published-0A0F1E?style=for-the-badge"/>

</div>

<div align="center">

<a href="https://github.com/rvakash13-abd">
<img src="https://img.shields.io/badge/GitHub-0A0F1E?style=for-the-badge&logo=github&logoColor=2CB1BC"/>
</a>
<a href="mailto:r.v.akash13@gmail.com">
<img src="https://img.shields.io/badge/Contact-Gmail-14213D?style=for-the-badge&logo=gmail&logoColor=E8FBFF"/>
</a>

</div>

<br>

<div align="center">

```text
              ┌──────────────────────┐
              │   ◉            ◉    │   <-- Ultrasonic (Servo Scan)
              │   ┌──────────────┐   │
              │   │   S E N T I  │   │
              │   │   N E L      │   │
              │   └──────────────┘   │
              │  [PIR]      [DHT11]  │
              │   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓   │
              │   VACUUM   SPEAKER   │
              └──┬────────────────┬──┘
               (⊙)              (⊙)
              Mobile App ⇄ Bluetooth ⇄ Arduino ⇄ Robot
```

</div>

---

## 🛰️ About the Project

**Smart Sentinel Robot** is an **offline autonomous and app-controlled robotic system** designed to assist in cleaning and provide basic safety-oriented monitoring. It combines **autonomous navigation, obstacle avoidance, human detection, vacuum-based cleaning, temperature monitoring, voice notifications**, and **mobile application control** into a single robotic platform — powered entirely by **rule-based logic on an Arduino microcontroller**, with no dependency on the internet, cloud, or AI/ML.

> **In short:** The robot scans its surroundings with an ultrasonic sensor, picks the clearer of two directions when it meets an obstacle, stops and alerts when it detects a person nearby, and can be switched to manual mode via a Bluetooth mobile app for guided vacuum cleaning — all fully offline.

📄 **Patent Status:** Published Patent Application — *"Smart Sentinel Robot"*, Application No. **202641068541 A**, Indian Patent Office (filed 30/05/2026, published 05/06/2026).

---

## 📌 Table of Contents

- [Objectives](#-objectives)
- [Key Features](#-key-features)
- [System Components](#-system-components)
- [Mobile Application](#-mobile-application)
- [System Architecture](#-system-architecture)
- [Working Principle](#-working-principle)
- [Autonomous Mode](#-autonomous-mode)
- [Manual Cleaning Mode](#-manual-cleaning-mode)
- [Tech Stack](#-tech-stack)
- [Project Photos](#-project-photos)
- [Patent Details](#-patent-details)
- [Advantages](#-advantages)
- [Future Scope](#-future-scope)
- [Conclusion](#-conclusion)
- [Contact](#-contact)

---

## 🎯 Objectives

| # | Objective |
|---|---|
| 1 | **Autonomous Navigation** — move automatically using sensor-based programmed logic |
| 2 | **Obstacle Avoidance** — detect obstacles and avoid collisions via ultrasonic sensor |
| 3 | **Direction Scanning** — scan left/right and select the comparatively clearer path |
| 4 | **Human Detection** — detect human presence with a PIR sensor and stop for safety |
| 5 | **Smart Cleaning** — integrate a vacuum mechanism for suction-based cleaning |
| 6 | **Mobile App Control** — provide a convenient control interface via app |
| 7 | **Bluetooth Communication** — enable local wireless communication (no internet) |
| 8 | **Voice Notification** — provide prerecorded audio alerts |
| 9 | **Temperature Monitoring** — measure temperature via DHT11 |
| 10 | **Offline Operation** — ensure all core functions work without internet/cloud |

---

## 🚀 Key Features

<table>
<tr>
<td width="50%" valign="top">

### 🧭 AUTONOMOUS NAVIGATION

```yaml
Status : Implemented
Logic  : Rule-based (no AI/ML)
```

* Moves independently using programmed logic
* Continuously monitors surroundings
* No internet or cloud dependency

</td>

<td width="50%" valign="top">

### 🛑 OBSTACLE AVOIDANCE

```yaml
Status : Implemented
Sensor : Ultrasonic + Servo
```

* Detects obstacles within ~25 cm
* Servo-mounted sensor scans both sides
* Turns toward the clearer direction

</td>
</tr>

<tr>
<td width="50%" valign="top">

### 🧍 HUMAN DETECTION

```yaml
Status : Implemented
Sensor : PIR
```

* Detects human presence during motion
* Robot stops immediately for safety
* Triggers a voice alert

</td>

<td width="50%" valign="top">

### 🧹 VACUUM CLEANING

```yaml
Status : Implemented
Mode   : Manual (App-Controlled)
```

* Suction-based cleaning mechanism
* ON/OFF controlled from the app
* Works alongside manual movement

</td>
</tr>

<tr>
<td width="50%" valign="top">

### 📱 BLUETOOTH APP CONTROL

```yaml
Status : Implemented
Link   : Local Bluetooth (offline)
```

* Start autonomous mode
* Manual movement + vacuum control
* Temperature/status requests

</td>

<td width="50%" valign="top">

### 🔊 VOICE + TEMPERATURE

```yaml
Status : Implemented
Modules: DFPlayer Mini · DHT11
```

* Prerecorded audio notifications
* Temperature measurement on request
* Status feedback to the user

</td>
</tr>
</table>

---

## 🧩 System Components

| Component | Purpose |
|---|---|
| Arduino | Main controller |
| Ultrasonic Sensor | Obstacle and distance detection |
| Servo Motor | Left/right scanning |
| PIR Sensor | Human detection |
| DHT11 Sensor | Temperature measurement |
| DFPlayer Mini | Audio playback |
| Speaker | Voice notifications |
| Motor Driver | Controls DC motors |
| DC Motors | Robot movement |
| Vacuum Motor | Cleaning / suction |
| Bluetooth Module | Mobile app communication |
| Mobile Application | User control interface |
| Battery / Power Supply | Supplies electrical power |
| Robot Chassis | Mechanical structure |

---

## 📱 Mobile Application

The mobile app is the user interface for the Smart Sentinel Robot, communicating with the Arduino over **Bluetooth** — no internet required.

**App functions:**
- Start autonomous operation
- Activate / deactivate the vacuum
- Move forward, backward, left, right, or stop
- Request temperature / status information

**App → Robot command map:**

| Command | Function |
|---|---|
| `2` | Start Autonomous Mode |
| `1` | Temperature / Status function |
| `3` | Vacuum ON + Manual Mode |
| `4` | Vacuum OFF + Stop |
| `f` | Forward |
| `b` | Backward |
| `l` | Left |
| `r` | Right |
| `s` | Stop |

> **Important:** The mobile app does not require the internet — communication is fully local through Bluetooth: `Mobile App → Bluetooth → Arduino → Robot`.

---

## 🏗️ System Architecture

```text
Mobile Application (User Interface)
        │  Bluetooth (Serial Communication)
        ▼
Arduino Software (Main Controller)
        │
        ├── Reads sensor data (Ultrasonic · PIR · DHT11)
        ├── Receives & processes app commands
        ├── Executes rule-based control logic
        ├── Manages autonomous & manual mode
        └── Sends status/feedback (optional)
        │
        ▼
Actuators (Output)
 ├── Motor Driver + DC Motors  → Movement
 ├── Vacuum Motor              → Suction-based cleaning
 └── DFPlayer Mini + Speaker   → Voice alerts

Overall Flow:
Mobile App → Bluetooth → Arduino Software → Sensors (Input) → Actuators (Output) → Robot Operation
```

---

## ⚙️ Working Principle

```text
[POWER ON]  Arduino initializes all sensors and actuators
[OVERALL]   Mobile App → Bluetooth → Arduino → Command Processing → Robot Action

Autonomous flow:
Start → Scan → Move → Detect Obstacle → Stop → Scan Left/Right → Select Clearer Direction → Continue

Human detection flow:
Human Detected → Robot Stops → Voice Alert

Manual cleaning flow:
Vacuum ON → Manual Movement → Cleaning → Vacuum OFF → Robot Stops
```

The robot uses **predefined conditions**, not AI-based decision-making. Example rule:
> If obstacle distance < 25 cm → stop → scan both sides → compare distances → turn toward the side with greater distance → continue forward.

---

## 🧭 Autonomous Mode

| Step | Action |
|---|---|
| 1 | User starts Autonomous Mode from the app (`2`) |
| 2 | Servo rotates the ultrasonic sensor to scan left & right |
| 3 | Arduino compares `leftDist` vs `rightDist` and picks the clearer side |
| 4 | Robot moves forward in the selected direction |
| 5 | Ultrasonic sensor continuously checks distance ahead |
| 6 | If distance < 25 cm → stop, play audio warning, rescan, turn, continue |
| 7 | PIR sensor checks for humans continuously — if detected, robot stops and gives a voice alert |

---

## 🧹 Manual Cleaning Mode

| App Button | Robot Action |
|---|---|
| Vacuum ON | Starts vacuum + enters manual mode |
| Forward | Moves forward |
| Backward | Moves backward |
| Left | Turns left |
| Right | Turns right |
| Stop | Stops movement |
| Vacuum OFF | Stops vacuum + stops robot |

Useful when the user wants to manually guide the robot to a specific area that needs cleaning.

---

## 🧰 Tech Stack

<div align="center">

![Arduino](https://img.shields.io/badge/Arduino-14213D?style=for-the-badge)
![Bluetooth](https://img.shields.io/badge/Bluetooth-14213D?style=for-the-badge)
![Embedded C](https://img.shields.io/badge/Embedded_C-14213D?style=for-the-badge)
![Servo](https://img.shields.io/badge/Servo_Motor-14213D?style=for-the-badge)
![Ultrasonic](https://img.shields.io/badge/Ultrasonic_Sensor-14213D?style=for-the-badge)
![PIR](https://img.shields.io/badge/PIR_Sensor-14213D?style=for-the-badge)
![DHT11](https://img.shields.io/badge/DHT11-14213D?style=for-the-badge)
![Mobile App](https://img.shields.io/badge/Mobile_App-14213D?style=for-the-badge)

</div>

**Arduino Libraries used:**
- `SoftwareSerial` — serial communication
- `DFRobotDFPlayerMini` — audio playback control
- `DHT` — temperature sensing
- `Servo` — directional scanning

**AI Clarification:** The current Smart Sentinel Robot does **not** use artificial intelligence or machine learning. Its autonomous behaviour is **rule-based**: `Sensors + Predefined Conditions + Arduino Programming`.

---

## 📸 Project Photos

> Add your actual project images here.

**Figure 1 — Complete Smart Sentinel Robot**
`![Smart Sentinel Robot](./assets/robot-photo.jpg)`

**Figure 2 — Mobile Application Interface**
`![Mobile App](./assets/app-screenshot.jpg)`

---

## 📜 Patent Details

| Field | Details |
|---|---|
| **Patent Title** | Smart Sentinel Robot |
| **Application Number** | 202641068541 A |
| **Patent Number** | Not allotted / not yet granted (Patent Application Publication) |
| **Filing Date** | 30/05/2026 |
| **Publication Date** | 05/06/2026 |
| **Applicant** | RMK College of Engineering and Technology |
| **Patent Office** | Indian Patent Office |
| **Status** | Published Patent Application |

**Inventors:**
1. Akash R.V
2. M. Nivasini
3. Jashiraa Shabrein S
4. Koushikan C.D
5. Vishal Srinivash M

**Innovation highlights:** autonomous navigation, sensor-based obstacle avoidance, human detection, vacuum cleaning, mobile app control, offline operation, voice notification, and temperature monitoring — combined within a single robotic platform.

---

## ✅ Results / Features Summary

```text
[✔] Autonomous Navigation      — moves automatically via programmed sensor logic
[✔] Obstacle Avoidance         — ultrasonic sensor enables directional correction
[✔] Servo-Based Scanning       — scans left/right for the clearer path
[✔] Human Detection            — PIR sensor stops robot during autonomous operation
[✔] Vacuum Cleaning            — integrated suction-based cleaning system
[✔] Mobile App Control         — Bluetooth-based user interface
[✔] Voice Alerts               — DFPlayer Mini + speaker notifications
[✔] Temperature Monitoring     — DHT11-based measurement
[✔] Dual Operating Modes       — Autonomous + Manual Cleaning
[✔] Offline Operation          — no internet or cloud dependency
```

---

## 💡 Advantages

1. **Offline Operation** — no internet dependency for core functions
2. **Mobile App Control** — convenient, intuitive interface
3. **Autonomous Navigation** — sensor-based programmed logic
4. **Obstacle Avoidance** — reduces collisions
5. **Human Detection** — added safety layer
6. **Vacuum Cleaning** — suction-based cleaning capability
7. **Dual Modes** — autonomous + manual operation
8. **Voice Feedback** — easy identification of key events
9. **Modular Design** — sensors/functions can be upgraded
10. **Reduced Human Effort** — automates repetitive cleaning work

---

## 🔮 Future Scope

- **Advanced Offline Navigation** — wheel encoders & extra sensors for accuracy
- **Room Mapping** — offline mapping to track already-cleaned areas
- **Automatic Charging** — a docking station for auto-recharge
- **Improved Cleaning** — better filtration, brushes, dust collection
- **Battery Monitoring** — alerts when charging is required
- **Enhanced Mobile App** — status, battery %, cleaning duration/history, sensor info
- **On-Device AI/ML** — optional future upgrade for smarter navigation and object recognition, while still staying offline

---

## 📝 Conclusion

The **Smart Sentinel Robot** is an offline, autonomous, and app-controlled robotic system combining cleaning, navigation, obstacle avoidance, human detection, temperature monitoring, and voice notification into one platform — built around an Arduino microcontroller with no dependency on internet, cloud, or AI/ML. Its core strength lies in this **offline, rule-based architecture**, demonstrating a practical application of embedded systems, robotics, sensor technology, and wireless communication in a flexible, real-world robotic cleaning solution.

---

## 📬 Contact

<div align="center">

<a href="https://github.com/rvakash13-abd">
<img src="https://img.shields.io/badge/GITHUB-0A0F1E?style=for-the-badge&logo=github&logoColor=2CB1BC"/>
</a>
<a href="mailto:r.v.akash13@gmail.com">
<img src="https://img.shields.io/badge/EMAIL-14213D?style=for-the-badge&logo=gmail&logoColor=E8FBFF"/>
</a>

<br><br>

**Akash R.V** — r.v.akash13@gmail.com

If you find this project useful, consider giving it a ⭐ on GitHub!

</div>

<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:0A0F1E,50:14213D,100:2CB1BC&height=120&section=footer"/>

</div>
