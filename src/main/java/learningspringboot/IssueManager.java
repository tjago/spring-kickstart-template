package learningspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.github.api.GitHubIssue;
import org.springframework.social.github.api.impl.GitHubTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for getting all the issues from repos
 */
@Service
public class IssueManager {

    @Value("${app.issue.manager.githubtoken}")
    String githubToken;

    @Value("${app.issue.manager.org.name}")
    String org;

    @Value("${app.issue.manager.repos}")
    String[] repos;

    GitHubTemplate gitHubTemplate;//= new GitHubTemplate(githubToken);

    public List<Issue> findOpenIssues() {
        gitHubTemplate = new GitHubTemplate(githubToken);

        List<Issue> openIssuesToFix = new ArrayList<>();

        for (String repo : repos) {
            final List<GitHubIssue> issues = gitHubTemplate
                    .repoOperations().getIssues(org, repo);
            for (GitHubIssue issue : issues) {
                if (issue.getState().equals("open")) {
                    openIssuesToFix.add(new Issue(repo, issue));
                }
            }
        }
        return openIssuesToFix;
    }

}