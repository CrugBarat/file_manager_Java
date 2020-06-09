package com.codeclan.FilesAndFolders.components;
import com.codeclan.FilesAndFolders.models.File;
import com.codeclan.FilesAndFolders.models.Folder;
import com.codeclan.FilesAndFolders.models.User;
import com.codeclan.FilesAndFolders.repositories.FileRepository;
import com.codeclan.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User user = new User();

        userRepository.save(user);

        Folder folder1 = new Folder("public", user);
        Folder folder2 = new Folder("assets", user);
        Folder folder3 = new Folder("fonts", user);

        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);

        File file1 = new File("index", ".html", "86K", folder1);
        File file2 = new File("favicon", ".ico", "200KB", folder1);
        File file3 = new File("style", ".css", "21MB", folder2);
        File file4 = new File("background", ".png", "88MB", folder2);
        File file5 = new File("logo", ".svg", "25KB", folder2);
        File file6 = new File("hero_image", ".jpg", "147MB", folder2);
        File file7 = new File("gothic", ".otf", "11KB", folder3);
        File file8 = new File("news", ".ttf", "8KB", folder3);

        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);
        fileRepository.save(file7);
        fileRepository.save(file8);

    }
}
