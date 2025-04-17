import github.tools.client.GitHubApiClient;
import github.tools.client.RequestParams; // 

public class GitRepoCreator {

    public static void main(String[] args) {

        String githubUsername = "Pkwiatkowski-ssj";
        String githubToken = "YOUR_GITHUB_TOKEN_HERE";


        // Create the GitHub API Client (with username and token)
        GitHubApiClient client = new GitHubApiClient(githubUsername, githubToken);

        // Create the parameters for the new repository
        RequestParams params = new RequestParams();
        params.addParam("name", "test-repo"); // repo name
        params.addParam("description", "Repo created by the Microsoft GUI application!"); // description
        params.addParam("private", "false"); // true = private, false = public

        try {
            // Create the repository
            client.createRepo(params);

            // Success Message
            System.out.println("✅ Repository created successfully!");
            System.out.println("🌎 You can view it at:");
            System.out.println("https://github.com/" + githubUsername + "/test-repo-created-by-microsoftgui");


        } catch (Exception e) {
            // Error Handling
            System.out.println("❌ Something went wrong while creating the GitHub repository.");
            e.printStackTrace();
        }
    }
}
