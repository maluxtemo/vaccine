package luk.tem.maluks.vaccineClient;

import java.time.Duration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class VaccineClientRESTfulClient {
    private final RestTemplate restTemplate;
    private static final String REST_URL = "http://localhost:8081/citizens/{idNumber}";

    public VaccineClientRESTfulClient(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(500))
                .setReadTimeout(Duration.ofSeconds(500)).build();
    }
    public CitizenDTO getCitizenWithResponseHandling(String idNumber) {
        ResponseEntity<CitizenDTO> response = this.restTemplate.getForEntity(REST_URL, CitizenDTO.class, idNumber);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            return null;
        }
    }
}
