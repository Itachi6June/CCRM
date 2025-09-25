# Campus Course & Records Manager (CCRM)

## System Description & Setup Guide

The Campus Course & Records Manager (CCRM) represents a comprehensive, full-stack solution developed with Java SE technology. This robust platform serves as a centralized hub for educational institution management, handling critical data including student records, academic course information, and financial tracking systems.

## System Prerequisites

**Java Development Kit (JDK):** Minimum version 17 or higher
**Development Environment:** Eclipse IDE, IntelliJ IDEA, or Visual Studio Code configured with Java development extensions

## Installation & Execution Instructions

### 1. Repository Setup
```bash
git clone <repository-url>
cd <project-directory>
```

### 2. IDE Configuration

**(a)** Launch your preferred development environment (Eclipse recommended).

**(b)** Navigate to File > Open Projects from File System... or alternatively Import... > Existing Maven/Gradle Project.

**(c)** Browse to and select the downloaded repository directory.

### 3. Application Execution

**(a)** Find the primary class file located at edu/ccrm/cli/Main.java.

**(b)** Right-click the Main.java file and choose Run As > Java Application.

### 4. Command Line Execution (Alternative Method)

**(a)** Navigate to the project source folder.

**(b)** Compile source code:
```bash
javac -d out edu/ccrm/cli/Main.java
```

**(c)** Execute compiled application:
```bash
java -cp out edu.ccrm.cli.Main
```

## Java Platform Development Timeline

### Historical Milestones

**1. JDK 1.0 (1996):** Java's inaugural release, originally named "Oak."

**2. J2SE 1.2 (1998):** Brought forth Swing GUI framework, Collections API, and Just-In-Time compilation technology.

**3. J2SE 5.0 (2004):** Revolutionary update introducing Generic programming, Enumeration types, Auto-boxing features, and Annotation support.

**4. Java SE 8 (2014):** Groundbreaking version featuring Lambda programming, Stream processing API, modernized Date/Time handling, and interface default methods.

**5. Java SE 11 (2018):** Initial Long-Term Support edition following the six-month release schedule, introducing local variable type inference with 'var' keyword.

**6. Java SE 17 (2021):** Subsequent LTS version delivering Sealed Class functionality and enhanced Pattern Matching capabilities.

**7. Java SE 21 (2023):** Current LTS release offering breakthrough features including Virtual Threading (Project Loom), Record Pattern matching, and Sequenced Collection types.

## Java Platform Editions Comparison

### Java SE (Standard Edition)
**Purpose:** Foundation platform for desktop and server-side applications.
**Core Components:** Essential Java language libraries (java.lang, java.util, etc.).
**Notable APIs:** Swing framework, Collections API, Stream processing, NIO.2
**Developer Base:** General application programmers.

### Java EE (Enterprise Edition)
**Purpose:** Specialized for enterprise-scale, web-centric application development.
**Core Components:** Extensions built upon Java SE foundation, incorporating web service APIs, servlet technology, etc.
**Notable APIs:** Servlet technology, JavaServer Pages (JSP), Enterprise JavaBeans (EJB), Java Persistence API (JPA), RESTful web services (JAX-RS)
**Developer Base:** Enterprise software architects.

### Java ME (Micro Edition)
**Purpose:** Optimized for resource-limited and embedded computing environments (IoT devices, legacy mobile phones).
**Core Components:** Streamlined subset of Java SE APIs, memory-optimized for constrained systems.
**Notable APIs:** Connected Limited Device Configuration (CLDC), Mobile Information Device Profile (MIDP)
**Developer Base:** Embedded systems programmers.

## Core Java Components Overview

The Java ecosystem operates through three fundamental components that collectively enable Java's cross-platform portability principle.

### JVM (Java Virtual Machine)
The JVM functions as an abstract computing environment that hosts Java bytecode execution. It transforms compiled .class files into platform-specific machine instructions for the host operating system. While the JVM itself is platform-specific, it enables Java applications to achieve platform independence.

### JRE (Java Runtime Environment)
The JRE encompasses all necessary components for executing Java applications. It bundles the JVM with essential Java class libraries and auxiliary support files. End-users who only need to run Java programs require solely the JRE installation.

### JDK (Java Development Kit)
The JDK provides the complete development toolkit for Java application creation. It incorporates all JRE components plus critical development utilities including the Java compiler (javac), debugging tools (jdb), and Java archive utility (jar). Software developers require the JDK for writing, compiling, and debugging Java applications.

**Simplified Relationship:** JDK encompasses JRE plus development tools, while JRE combines JVM with core libraries.

### JDK Installation

**1.** Search oracle java on google.
<img width="1645" height="1036" alt="image" src="https://github.com/user-attachments/assets/06136dbb-800e-4fb9-a2e9-6101b3b9f31a" />

**2.** Got to the official site and click on download java.
<img width="1644" height="1008" alt="image" src="https://github.com/user-attachments/assets/b710c489-3a77-48ef-a93d-6c410ca13fe7" />

**3.** Select JDK 24 from top left and choose windows, Press on any download link.
<img width="1559" height="1023" alt="image" src="https://github.com/user-attachments/assets/dd8a1ed2-6738-47ee-8e07-dccbc9f64e8f" />

**4.** Run the installer, press next.
<img width="1793" height="974" alt="image" src="https://github.com/user-attachments/assets/6823a3b5-d37c-448e-b129-e89c90de091e" />
<img width="1014" height="719" alt="image" src="https://github.com/user-attachments/assets/c479c51c-2968-4e79-b18d-5d21f5b440a7" />

**5.** Set the installation directory, then press next, let it install.
<img width="1132" height="754" alt="image" src="https://github.com/user-attachments/assets/b4871975-c6ed-47cd-8ada-0cd85813d940" />
<img width="956" height="753" alt="image" src="https://github.com/user-attachments/assets/578ff0a5-af5b-406f-b9f6-06c41e77ce95" />

**6.** Copy the directory c:/program files/java/jdk-24/bin and paste to environment variables.
<img width="1300" height="880" alt="image" src="https://github.com/user-attachments/assets/c3aa6772-e733-4357-b55d-55b6024dd9be" />

### Eclipse Installation

**1.** Search eclipse on google and go to the official site
<img width="1544" height="881" alt="image" src="https://github.com/user-attachments/assets/cf544670-2b1a-4a53-869f-45246642ed68" />

**2.** Go to official site then press on download.
<img width="1791" height="990" alt="image" src="https://github.com/user-attachments/assets/3c0cff0f-eb31-48bc-88e9-85f229222f5a" />

**3.** Press on download button
<img width="1792" height="961" alt="image" src="https://github.com/user-attachments/assets/69242824-8225-4f69-bb02-43483be4bd70" />

**4.** Again press download and your download should begin.
<img width="1716" height="729" alt="image" src="https://github.com/user-attachments/assets/8dfaf36d-8769-4938-9ac3-6094e18bdf1a" />
<img width="1339" height="773" alt="image" src="https://github.com/user-attachments/assets/159de78b-5f42-450a-833a-828d7afd3626" />

**5.** Run the installer file
<img width="699" height="548" alt="image" src="https://github.com/user-attachments/assets/04d55e00-5965-4b3f-9ab9-d1435d146094" />

**6.** Select eclipse IDE for java developer
<img width="846" height="780" alt="image" src="https://github.com/user-attachments/assets/3a8b2507-1627-43ed-91c7-3686c30f332e" />

**7.** Press on install
<img width="751" height="762" alt="image" src="https://github.com/user-attachments/assets/64d11262-7d19-4b16-880d-756a366dd94c" />

**8.** Press accept now.
<img width="723" height="819" alt="image" src="https://github.com/user-attachments/assets/5c5f6f75-753f-42af-83a7-9e516f8488e7" />

**9.** Add your workspace directory where all your java projects will be saved and press launch.
![Uploading image.png…]()

**10.** Eclipse is installed.
![Uploading image.png…]()
