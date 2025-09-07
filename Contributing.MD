
# Contributing Guide

Welcome!
We’re so happy you’re interested in contributing to this project.
This guide will help you understand **how to contribute**, step by step.

---

## What does “contributing” mean?

Contributing means helping to make the project better.
It can be:

* Fixing a bug
* Adding a new feature
* Improving documentation
* Suggesting ideas

---

## Before you start

1. **Fork the repo** → This makes a personal copy of the project in your GitHub account.
   *(Think of it like making your own notebook where you can write without changing the original one.)*

2. **Clone the repo** → Download your copy to your computer.

   ```bash
   git clone https://github.com/your-username/GITHUB-GITAM-OS-Practice-Repo.git
   ```

3. **Install dependencies** → Some projects need extra software to run.
   Usually, you’ll run:

   ```bash
   npm install   # if JavaScript/Node.js
   pip install -r requirements.txt  # if Python
   ```

   HERE NOT NEED MOSTLY

   (Check the README for details.)

---

## Create a new branch

Branches let you work on changes without touching the main project directly.

```bash
git checkout -b my-feature
```

* `my-feature` can be any name (like `fix-typo` or `add-login-button`).

---

## Make your changes

* Edit files, write code, or improve docs.
* Keep your changes **small and focused** (easier to review).

---

## Test your changes

* Run the project and check if everything still works.
* If there are tests, run them:

  ```bash
  npm test
  ```
  EXAMPLE ONY, Check README.md for details
* If not, just make sure your changes don’t break anything.

---

## Commit your changes

A **commit** is like saving a snapshot of your progress.

```bash
git add .
git commit -m "Fix typo in README"
```

Write clear commit messages:

* Bad: `fix stuff`
* Good: `Fix typo in installation guide`

---

## Push and Open a Pull Request

1. Push your branch:

   ```bash
   git push origin my-feature
   ```

2. Go to GitHub → You’ll see a button to **Open Pull Request (PR)**.

3. In the PR description:

   * Explain what you changed
   * Mention why it’s useful

---

## Code Review

* Project maintainers will review your PR.
* They may ask for changes → don’t worry, it’s normal!
* After approval, your changes get merged 🎉

---

## Tips for Beginners

* Don’t be afraid of making mistakes — that’s how you learn.
* Even fixing a typo is a great contribution.
* Ask questions if you’re stuck, we’re here to help.

---

## Thank You

Every contribution, big or small, makes this project better.
Thank you for being awesome and helping out! 🙌

