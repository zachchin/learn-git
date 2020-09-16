# learn-git

## Background

This is a simple game of tic-tac-toe with all parts implemented except for two methods. At this time, it does not:

- take a player's move and add it to the board
- correctly check for a tied game when there is no winner

Your job is to implement the first function (adding a player's move to the board), merge it with a branch that contains a solution for the second function, merge it to master, then push your changes.

## Instructions

Follow these instructions and answer the questions for yourself to understand what is going on.

1. Fork the repository in your own GitHub account.
2. Clone the repository to your local machine
   a. Run `git clone git@github.com:<your-username>/learn-git.git`
   b. Run `cd learn-git`
3. Create your own branch where you implement and test `playerTurn(...)`
   a. Run `git branch`. What do you see? What branch are you on?
   b. Run `git log`. Notice which commits you see here. Press `q` to quit.
   c. Run `git branch player-turn`, then run `git branch`. What do you see now? What branch are you on?
   d. Run `git checkout player-turn`, then run `git branch`. What branch are you on now?
   e. Run `git log`. Notice which commits you see here. Press `q` to quit.
   f. Run `git checkout origin/check-tie`, then run `git log`. Notice which commits you see now. Press `q` to quit.
   g. Run `git checkout player-turn`.
   h. Implement the method `playerTurn(...)` in `Engine.java`.
4. Stage and commit your changes.
   a. Run `git status`. What do you see?
   b. Run `git add Engine.java`, then run `git status` again. What do you see now?
   c. Run `git log`. Notice which commits you see. Press `q` to quit.
   d. Run `git commit -m "<your-commit-message>"`
   e. Run `git log` again. Notice which commits you see now. Press `q` to quit.
   f. Run `git status`. What do you see now?
5. Push your changes from this branch.
   a. Check your GitHub repository. Notice the commit history and branches.
   b. Run `git push -u origin player-turn`. Check your GitHub repository now, how have the branches and commit history changed?
   Note that the flag `-u` sets your local branch to track a remote branch with the same name when you push for the first time. Use `git push` to make subsequent pushes in this branch. You can read more about this in the Git documentation, but don't worry about it for this tutorial.
6. Merge your changes.
   a. Run `git merge check-tie`. How does `Engine.java` look? What did this command do?
   b. Run `git log`. What did the `merge` command do with all the previous commits? Did it make any new commits?
   c. Run `git checkout master`, then run `git log` again. Notice which commits you see. Press `q` to quit.
   d. Run `git merge player-turn`. How does `Engine.java` look? What did this command do?
   e. Run `git log`. What did the `merge` command do this time?
7. Push your merged changes in master.
   a. Check your GitHub repository. Notice the commit history and branches.
   a. Run `git push`. Check your GitHub repository now, how have the branches and commit history changed?

## More resources

- Git Exercises: https://github.com/eficode-academy/git-katas
- Complex Branching: https://learngitbranching.js.org/
- Git Game (this is less conceptual but makes you use some useful commands): https://github.com/git-game/git-game
