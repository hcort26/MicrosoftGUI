/* 
import java.util.Scanner;
import git.tools.client.GitSubprocessClient;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for project folder
        System.out.print("Enter the full path to your local project folder: ");
        String projectPath = scanner.nextLine();

        // Prompt user for GitHub info
        System.out.print("Enter your GitHub username: ");
        String githubUsername = scanner.nextLine();

        System.out.print("Enter your GitHub token (keep this secret): ");
        String githubToken = scanner.nextLine();

        System.out.print("Enter your desired repository name: ");
        String repoName = scanner.nextLine();

        // Create the GitHub repository
        GitRepoCreator repoCreator = new GitRepoCreator(githubUsername, githubToken);
        String remoteUrl = repoCreator.createRepo(repoName, "Repo created by Microsoft GUI app", false);

        // Stop if repo creation failed
        if (remoteUrl == null) {
            System.out.println("Stopping because repo could not be created.");
            return;
        }

        // Run Git local initializer
        GitProjectInitializer initializer = new GitProjectInitializer(projectPath);
        initializer.initializeProject(repoName, remoteUrl);

        scanner.close();
    }
}

*/

