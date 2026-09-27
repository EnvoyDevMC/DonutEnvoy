# 🍩 DonutEnvoy | The Stability Injector for DonutSMP

[![GitHub Repository](https://img.shields.io/github/repo/your-username/DonutEnvoy?style=for-the-badge&color=blue)](https://github.com/your-username/DonutEnvoy)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Build Status](https://img.shields.io/github/actions/workflow/status/your-username/DonutEnvoy/build.yml?style=for-the-badge&color=brightgreen)](https://github.com/your-username/DonutEnvoy/actions/workflows/build.yml)
[![Version](https://img.shields.io/badge/Version-v1.2.0-red.svg)](CHANGELOG.md#v1.2.0)

---

## 🚀 💡 Quick Pitch: Why DonutEnvoy?

Tired of micro-stutters, rubber-banding mid-fight, and connection lag making DonutSMP feel inconsistent? **DonutEnvoy** is not just another overlay; it is a deep-level network and rendering modifier engineered to restore the *feeling* of perfect performance.

Our core mission is simple: **Eliminate latency perception** so you can focus entirely on gameplay. We achieve this through proprietary predictive algorithms and tightly integrated client/server hooks.

---

## ✨ Core Features & Benefits

*   **🛠️ Latency Stabilization (The Core Fix):** Advanced packet queuing and Jitter Compensation ensure your character position feels smooth, even when the connection hiccups.
*   **🌐 Server/Client Synchronization:** Intelligent Entity Prediction modeling keeps your screen perfectly aligned with the server state, eliminating visual 'snapping' during rapid movement.
*   **⚔️ Enhanced PvP Experience:** Custom Hit Registration Smoothing and optimized HUD rendering mean hit detection feels instant, and the UI remains crystal clear under combat pressure.
*   **🛡️ Obfuscated Core Logic:** Our primary algorithmic routines are heavily obfuscated, making simple reverse-engineering and cheat detection significantly more complex for casual scrapers.

## 🔬 How Does It Work? (The Tech Deep Dive)

DonutEnvoy operates by injecting logic at key points in the Minecraft event lifecycle:

1.  **Network Hooks:** We intercept raw packets, analyze the variance (jitter), and run our **Kalman Filter** to mathematically predict the *true* next state of entities.
2.  **Rendering Hooks:** We override standard rendering calls to apply predictive offsets, ensuring that entities are drawn where they *will be*, not where they *were*.
3.  **Configuration:** All performance levers are exposed in `donutenvoy.json`, allowing fine-tuning based on your specific connection or server load.

---

## ⚙️ Technical Specifications

| Specification | Detail |
| :--- | :--- |
| **Mod Name** | DonutEnvoy |
| **Version** | `v1.2.0` |
| **Target Game** | Minecraft |
| **Compatibility** | DonutSMP Server |
| **Fabric API** | **1.21.11** (Required) |
| **Build System** | Gradle |
| **License** | MIT |

---

## 📥 Installation Guide

1.  **Prerequisites:** Ensure you have **Forge** or **Fabric** installed (Fabric is recommended for this version).
2.  **Download:** Download the latest JAR file from the [Releases Page](https://github.com/EnvoyDevMC/DonutEnvoy/releases)
3.  **Placement:** Place `DonutEnvoy-v1.2.0.jar` into your Minecraft `mods` folder.
4.  **Launch:** Start your Minecraft client and experience the stability boost immediately!

---

## 📖 Changelog & History

Check out our **[CHANGELOG.md](CHANGELOG.md)** for a full breakdown of features, fixes, and performance tweaks.

### 🌟 Latest Update Highlights (v1.2.0)
*   **Added:** Major overhaul to the packet prediction algorithm for superior smoothness.
*   **Fixed:** Resolved intermittent entity tracking failure during high-speed bunny-hopping in PvP.
*   **Changed:** Increased default network buffer size from 128 to 256 packets for better handling of burst traffic.

---

## 🤝 Get Involved & Report Bugs

We welcome contributions! Whether you're reporting a bug, suggesting a new feature, or want to contribute code, use the templates below.

➡️ **[Create Bug Report](https://github.com/your-username/DonutEnvoy/issues/new?title=Bug%20Report&template=bug_report.md)**
➡️ **[Request New Feature](https://github.com/your-username/DonutEnvoy/issues/new?title=Feature%20Request&template=feature_request.md)**

---
*(Optional: Add a small placeholder section here for your GIF/Screenshot embeds!)*
**[ Placeholder GIF: Before vs. After Smoothness ]**
*Image caption: See the difference in entity movement when DonutEnvoy is active!*
