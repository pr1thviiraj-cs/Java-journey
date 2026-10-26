<!-- ═══════════════════ HERO SECTION ═══════════════════ -->

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&height=220&color=0:09090B,40:312E81,75:0891B2,100:09090B&text=TO-DO%20LIST&fontColor=FFFFFF&fontSize=60&fontAlignY=38&desc=Plan%20it.%20Do%20it.%20Become%20better.&descAlignY=58&descSize=17&animation=fadeIn" width="100%" alt="Animated To-Do List banner"/>

<br/>

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=600&size=18&duration=2800&pause=900&color=67E8F9&center=true&vCenter=true&width=650&lines=YOUR+DAY.+YOUR+GOALS.+YOUR+PROGRESS.;One+task+at+a+time+%E2%9C%A8;Built+with+Java+%E2%98%95;Small+steps.+Big+results." alt="Animated typing introduction"/>

<br/><br/>

<a href="#"><img src="https://img.shields.io/badge/BUILT%20WITH-JAVA-06B6D4?style=for-the-badge&logo=openjdk&logoColor=white" alt="Built with Java"/></a>
<img src="https://img.shields.io/badge/PROJECT-CONSOLE%20APP-7C3AED?style=for-the-badge" alt="Console app"/>
<img src="https://img.shields.io/badge/STATUS-ACTIVE-10B981?style=for-the-badge" alt="Project status"/>
<img src="https://img.shields.io/badge/STORAGE-IN--MEMORY-F59E0B?style=for-the-badge" alt="In-memory storage"/>

<br/><br/>

**A minimal, interactive task manager crafted with Core Java.**

*Clear your mind. Organize your goals. Get things done.*

<br/>

[ ✦ Features ](#-features) · [ ⚡ Setup ](#-get-started) · [ ◈ Architecture ](#-project-architecture) · [ ☕ Concepts ](#-what-i-learned)

</div>

---

<!-- ═══════════════════ ABOUT ═══════════════════ -->

## ◈ 01 — The Idea

<div align="center">

> ### ✧ Less chaos. More clarity. ✧
>
> A simple console-based task manager designed to turn everyday to-dos into manageable actions.

</div>

This project is part of my journey into Java development. It transforms fundamental programming concepts into a working application with a clean terminal experience.

No unnecessary complexity. No database setup. Just **Java, logic, and productivity.**

---

## ✦ 02 — Features

<table>
<tr>
<td width="50%" valign="top">

### <img src="https://img.shields.io/badge/01-06B6D4?style=flat-square" alt="01"/> Create

Add tasks with meaningful titles.

- Empty titles are rejected.
- Tasks are added dynamically.
- Instant confirmation messages.

</td>
<td width="50%" valign="top">

### <img src="https://img.shields.io/badge/02-8B5CF6?style=flat-square" alt="02"/> Organize

View your entire task list.

- Numbered task display.
- Clear pending/completed status.
- Total progress summary.

</td>
</tr>
<tr>
<td width="50%" valign="top">

### <img src="https://img.shields.io/badge/03-10B981?style=flat-square" alt="03"/> Complete

Turn intentions into achievements.

- Mark tasks as completed.
- Prevent duplicate completion.
- Track pending tasks.

</td>
<td width="50%" valign="top">

### <img src="https://img.shields.io/badge/04-F59E0B?style=flat-square" alt="04"/> Remove

Keep your task list relevant.

- Delete tasks by their number.
- Validate task selection.
- Automatically update list indices.

</td>
</tr>
</table>

<div align="center">

<img src="https://media.giphy.com/media/3o7aD2saalBwwftBIY/giphy.gif" width="230" alt="Decorative animated sparkle" />

<sub>Every completed task is a little win. ✨</sub>

</div>

---

## ⚡ 03 — Get Started

### Requirements

| Tool | Purpose |
|:---|:---|
| Java JDK | Compile and run the application |
| IntelliJ IDEA | Recommended development environment |
| Terminal | Interact with the application |

### Installation

**01 — Clone the repository**

```bash
git clone YOUR_REPOSITORY_URL
cd To-Do-List-Application
```

Replace `YOUR_REPOSITORY_URL` with your actual repository URL.

**02 — Check the structure**

```text
To-Do-List-Application/
└── src/
    └── To_Do_List_Application/
        ├── TodoApp.java
        └── Task.java
```

**03 — Compile and run**

From the directory containing `To_Do_List_Application`:

```bash
javac To_Do_List_Application/*.java
java To_Do_List_Application.TodoApp
```

Alternatively, open `TodoApp.java` in IntelliJ IDEA and click **Run ▶**.

---

## ◈ 04 — Terminal Experience

<div align="center">

<img src="https://img.shields.io/badge/TERMINAL-PREVIEW-111827?style=for-the-badge&logo=windows-terminal&logoColor=67E8F9" alt="Terminal preview"/>

</div>

```text
╔══════════════════════════════════════════════════╗
║                                                  ║
║             T O - D O   L I S T   A P P          ║
║                 Plan. Do. Achieve.               ║
║                                                  ║
╠══════════════════════════════════════════════════╣
║                                                  ║
║   [1]  Add a New Task                            ║
║   [2]  View All Tasks                            ║
║   [3]  Mark Task as Completed                    ║
║   [4]  Delete a Task                             ║
║   [5]  Exit Application                          ║
║                                                  ║
╚══════════════════════════════════════════════════╝

  YOUR TASKS
  ──────────────────────────────────────────────────

  Total: 3    Completed: 1    Pending: 2

  01. Learn Java Fundamentals            [DONE]
  02. Practice Problem Solving           [TODO]
  03. Build Something Amazing            [TODO]

  ──────────────────────────────────────────────────
  Choose an option (1-5): _
```

<sub>Illustrative mockup — the actual console layout is defined by the Java source code.</sub>

---

## 🧩 05 — Project Architecture

```text
src/
└── To_Do_List_Application/
    │
    ├── TodoApp.java
    │   ├── printHeader()
    │   ├── printMenu()
    │   ├── addTask()
    │   ├── viewTasks()
    │   ├── completeTask()
    │   ├── deleteTask()
    │   └── main()
    │
    └── Task.java
        ├── title
        ├── completed
        └── Task(String title)
```

### How the application works

<div align="center">

`START` → `DISPLAY MENU` → `GET INPUT` → `EXECUTE ACTION` → `REPEAT`

</div>

1. Initialize an empty `ArrayList<Task>`.
2. Display the menu and read the user's choice.
3. Call the corresponding method.
4. Update or display the task list.
5. Repeat until the user chooses Exit.

---

## ☕ 06 — What I Learned

<div align="center">

| Concept | Application |
|:---|:---|
| Classes & Objects | Represent individual tasks |
| Constructors | Initialize task objects |
| `ArrayList` | Manage a dynamic task collection |
| `Scanner` | Read user input |
| Loops | Repeat the application menu |
| `switch` | Handle menu choices |
| Methods | Organize reusable operations |
| Boolean Logic | Track completion status |
| Input Validation | Handle invalid selections |

</div>

This project helped me practice writing structured Java code, separating responsibilities into methods, and handling user interaction.

---

## 🚀 07 — The Road Ahead

The current version focuses on core Java and in-memory task management. Future improvements could include:

- [ ] Task priorities and categories
- [ ] Due dates and deadline reminders
- [ ] Search and filter functionality
- [ ] A graphical interface using Java Swing
- [ ] File-based persistence
- [ ] Database integration
- [ ] A web-based version

*One project is a beginning. Continuous improvement is the goal.*

---

## 🤝 08 — Feedback & Contributions

Have an idea to improve this project?

- Open an issue to suggest a feature.
- Share feedback about the code.
- Fork the repository and experiment.

If you find the project interesting, consider giving it a ⭐ on GitHub.

---

<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=600&size=17&duration=2600&pause=1000&color=A78BFA&center=true&vCenter=true&width=600&lines=Keep+learning.;Keep+building.;Make+every+line+of+code+count." alt="Animated closing message"/>

<br/>

<img src="https://capsule-render.vercel.app/api?type=waving&height=120&section=footer&color=0:09090B,50:312E81,100:0891B2" width="100%" alt="Decorative footer banner"/>

**Made with ☕ and Java**

<sub>Stay focused · Stay curious · Keep creating</sub>

</div>