//Branching -> creating a new development line without affecting the main line
//        git branch -> shows you the available branches AND which branch you are currently at
//        git branch <nameOfBranch> -> git branch newFeature  -  creates a new branch from the current main branch (creates a copy)
//        git checkout <nameOfBranch> -> git checkout newFeature  - switches to a new branch
//        git merge <branchThatNeedsToBeMerged> git merge newFeature -> merges changes from one branch to another (you need to be in main branch to merge changes from the newFeature branch)
//        git branch -D <nameOfBranch>  -> git branch -D user-story-003 -> deletes the branch (you need to be in a different branch to delete it)
//        Merge conflicts:
//
//        <<<<<<< HEAD
//        System.out.println("Hi");        // anything between HEAD and =======
//                Integer y = 0;                    // my changes
//                y++;
//                =======
//                System.out.println("Bonjour");
//
//                double x = 0;                       // anything between ======= and >>>>>>>
//                x++;                               // other person's changes
//                >>>>>>> blabla
//                To resolve the merge conflict, remove the extra lines (<<<<<<< HEAD , =======, >>>>>>> blabla )
//        choose which version to keep, and make sure to create a new commit to resolve the merge conflict
//        Merge conflicts can occur:
//        1. The lines of the same file is changed by two people
//        2. When one person deletes the file, where other person adds a change
//        3. Two people create a new file with the same name
//        To prevent merge conflicts, avoid those 3 scenarios
//        How to collaborate on a project using Git/Github:
//        1. Team lead creates a project and pushes it to a remote repository and gives a push access to other team members (add them as collaborators)
//        2. Other team members clone the repository
//        3. Everyone needs to create a new branch to avoid working in the main branch
//        4. Add new changes in your own branch, commit the change, and push the branch to remote
//        git push --set-upstream origin myBranch
//        5. Create a pull request for the branch code to be reviewed by others
//        6. Once the code is reviewed, the reviewer closes the pull request and merges the branch
//        7. You need to delete the branch remotely and locally
//