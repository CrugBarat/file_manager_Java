# File Manager

This exercise was tasked to me by CodeClan, Glasgow where I studied towards a PDA Level 8 in Professional Software Development. The exercise brief can be found below.

## Brief

- Create a one-to-many Spring application using annotations
- Your application should have the following models: Folders, Files and Users
- Users should have many folders, and folders should have many files
- You’ll need to create repositories for each entity
- You’ll need to create controllers for each entity and ensure they implement the index, create and show routes

**MVP**

Create a system to track files and folders.

A File should have:
- a name
- extension (e.g. txt, rb, java, ppt)
- size
- folder

A User should have:
- name
- a list of folders

A Folder should have:
- a title
- list of files
- a user

- Create a seeding file DataLoader component to pre-seed the database
- Test with insomnia to test the routes
