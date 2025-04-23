import java.util.Scanner;
import git.tools.client.GitSubprocessClient;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the full path to your local project folder: ");
        String projectPath = scanner.nextLine();

        System.out.print("Enter your GitHub username: ");
        String githubUsername = scanner.nextLine();

        System.out.print("Enter your desired repository name: ");
        String repoName = scanner.nextLine();

        // Construct GitHub remote URL
        String remoteUrl = "https://github.com/" + githubUsername + "/" + repoName;

        // Create and run initializer
        GitProjectInitializer initializer = new GitProjectInitializer(projectPath);
        initializer.initializeProject(repoName, remoteUrl);

        scanner.close();
    }
}


