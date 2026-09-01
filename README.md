# 📱 Practical-3: Implicit & Explicit Intent in Android

## 🎯 Aim

To create an Android application that demonstrates **Implicit Intent** and **Explicit Intent** using **Kotlin in Android Studio**.

---

# 📲 Application Demo

### Features Demonstrated

| Intent Feature    | Description                                        |
| ----------------- | -------------------------------------------------- |
| 🌐 Open Website   | Opens a specific URL in the browser.               |
| 📞 Make Call      | Opens the phone dialer with a phone number.        |
| 📋 Call Log       | Opens the device call history.                     |
| 🖼️ Gallery       | Opens the image gallery.                           |
| 📷 Camera         | Launches the device camera.                        |
| ⏰ Set Alarm       | Creates a new alarm with time and message.         |
| 🔐 Login Activity | Navigates to Login Activity using Explicit Intent. |

---

# 🎥 Screen Recording

> Add your screen recording after uploading it to GitHub.

```text
https://github.com/hellyv102-sys/Practical-3/blob/main/ScreenRecording.mp4
```

---

# 📝 Implementation Steps

| Step  | Operation                                         |
| ----- | ------------------------------------------------- |
| **1** | Open a website using an Implicit Intent.          |
| **2** | Open the phone dialer with a specific number.     |
| **3** | Open the Call Log application.                    |
| **4** | Open the Gallery to select an image.              |
| **5** | Launch the Camera application.                    |
| **6** | Set an Alarm with predefined time and label.      |
| **7** | Navigate to Login Activity using Explicit Intent. |

---

# ⚙️ Application Logic

## 🔹 Implicit Intent

Implicit Intent is used to perform an action by allowing Android to find a suitable application installed on the device.

### 🌐 Open Website

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)
```

**Purpose:** Opens Google in the default web browser.

---

### 📞 Make Phone Call

```kotlin
val intent = Intent(Intent.ACTION_DIAL)
intent.data = Uri.parse("tel:9876543210")
startActivity(intent)
```

**Purpose:** Opens the phone dialer with the given phone number.

---

### 📋 Open Call Log

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.type = CallLog.Calls.CONTENT_TYPE
startActivity(intent)
```

**Purpose:** Opens the device Call Log.

---

### 🖼️ Open Gallery

```kotlin
val intent = Intent(Intent.ACTION_PICK)
intent.type = "image/*"
startActivity(intent)
```

**Purpose:** Opens the Gallery for selecting an image.

---

### 📷 Open Camera

```kotlin
val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
startActivity(intent)
```

**Purpose:** Launches the Camera application.

---

### ⏰ Set Alarm

```kotlin
val intent = Intent(AlarmClock.ACTION_SET_ALARM)

intent.putExtra(
    AlarmClock.EXTRA_HOUR,
    7
)

intent.putExtra(
    AlarmClock.EXTRA_MINUTES,
    30
)

intent.putExtra(
    AlarmClock.EXTRA_MESSAGE,
    "Wake Up"
)

startActivity(intent)
```

**Purpose:** Creates an alarm at **7:30 AM** with the label **Wake Up**.

---

# 🔹 Explicit Intent

Explicit Intent is used to open a specific Activity within the same Android application.

### 🔐 Open Login Activity

```kotlin
val intent = Intent(this, LoginActivity::class.java)
startActivity(intent)
```

**Purpose:** Navigates from `MainActivity` to `LoginActivity`.

---

# 🎨 User Interface (UI)

## 🏠 Main Activity (`activity_main.xml`)

The home screen is designed using **ConstraintLayout**.

### Components Used

* EditText for Website URL
* EditText for Phone Number
* Button for opening Website
* Button for making a Phone Call
* Button for opening Call Log
* Button for opening Gallery
* Button for opening Camera
* Button for setting Alarm
* Button for opening Login Activity

### Buttons Available

* 🌐 Open Website
* 📞 Make Call
* 📋 Call Log
* 🖼️ Gallery
* 📷 Camera
* ⏰ Set Alarm
* 🔐 Login Activity

---

# 🔑 Login Activity (`activity_login.xml`)

A simple login screen created using **Explicit Intent**.

### Components Used

* University Logo (`ImageView`)
* `MaterialCardView`
* Email `EditText`
* Password `EditText`
* Login Button
* Forgot Password `TextView`

---

# 🔒 Android Permissions

The following permissions can be added inside `AndroidManifest.xml` if required by the implementation:

```xml
<uses-permission android:name="android.permission.CALL_PHONE"/>
<uses-permission android:name="android.permission.CAMERA"/>
```

These permissions allow the application to access phone calling and camera features when those APIs require them.

> **Note:** `ACTION_DIAL` normally does not require the `CALL_PHONE` permission because it opens the dialer rather than directly placing the call.

---

# 📸 Output Screenshots

## 🏠 Home Screen

![application](Screenshots/application.png)

---

## 🌐 Open Website

![Website](Screenshots/Website.png)

---

## 📞 Make Phone Call

![Phonecall](Screenshots/Phonecall.png)

---

## 📋 Open Call Log

![CallLog](Screenshot/CallLog.png)

---

## 🖼️ Open Gallery

![Gallery](Screenshot/Gallery.png)

---

## 📷 Open Camera

![Camera](Screenshot/Camera.png)

---

## ⏰ Set Alarm

![Set Alarm](Screenshot%202026-08-31%20203340.png)

---

## 🔐 Login Activity

![Login](Screenshot/Login.png)

---

# 📂 Project Structure

```text
Practical-3/
│
├── app/
│
├── java/
│   ├── MainActivity.kt
│   └── LoginActivity.kt
│
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   └── activity_login.xml
│   │
│   ├── drawable/
│   └── mipmap/
│
├── AndroidManifest.xml
│
├── Screenshots/
│
└── README.md
```

---

# 🛠️ Tools & Technology

| Software / Technology | Used For                                          |
| --------------------- | ------------------------------------------------- |
| Android Studio        | Application Development                           |
| Kotlin                | Programming Language                              |
| XML                   | User Interface Design                             |
| ConstraintLayout      | UI Layout                                         |
| Android SDK           | Android Development                               |
| Intent                | Communication between Activities and Applications |

---

# 📚 Concepts Demonstrated

### Implicit Intent

Used when the application does not specify a particular application or component to handle the action.

Examples:

* Opening a website
* Opening the phone dialer
* Opening Call Log
* Opening Gallery
* Opening Camera
* Setting an Alarm

### Explicit Intent

Used when the application specifies the exact Activity or component to open.

Example:

* Opening `LoginActivity` from `MainActivity`

---

# ✅ Result

The Android application was successfully developed using **Kotlin and Android Studio** to demonstrate both **Implicit Intent** and **Explicit Intent**.

The application successfully demonstrates:

* 🌐 Opening a website
* 📞 Opening the phone dialer
* 📋 Opening Call Log
* 🖼️ Opening Gallery
* 📷 Launching Camera
* ⏰ Setting an Alarm
* 🔐 Navigating to Login Activity using Explicit Intent

Thus, the practical successfully demonstrates the working of **Implicit and Explicit Intents in Android**.
