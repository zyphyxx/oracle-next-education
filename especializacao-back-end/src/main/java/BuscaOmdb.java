import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaOmdb {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        final String ENDERECO = "https://www.omdbapi.com/?t=";
        final String API = "&apikey=c066330f";


        System.out.println("Digite o nome do filme:");
        String busca = busca = scanner.nextLine();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create(ENDERECO + busca + API))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        scanner.close();


    }

}
