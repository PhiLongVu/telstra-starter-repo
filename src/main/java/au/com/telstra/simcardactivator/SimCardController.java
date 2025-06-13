package au.com.telstra.simcardactivator;

import au.com.telstra.simcardactivator.ActuatorRequest;
import au.com.telstra.simcardactivator.ActuatorResponse;
import au.com.telstra.simcardactivator.SimCardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class SimCardController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/activate")
    public String activateSimCard(@RequestBody SimCardRequest request) {
        // Create request for actuator
        ActuatorRequest actuatorRequest = new ActuatorRequest(request.getIccid());

        // Send POST to actuator
        ActuatorResponse response = restTemplate.postForObject(
                "http://localhost:8444/actuate",
                actuatorRequest,
                ActuatorResponse.class
        );

        // Print and return result
        if (response != null && response.isSuccess()) {
            System.out.println("SIM activation successful.");
            return "SIM activation successful.";
        } else {
            System.out.println("SIM activation failed.");
            return "SIM activation failed.";
        }
    }
}
