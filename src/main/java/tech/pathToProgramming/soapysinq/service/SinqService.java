package tech.pathToProgramming.soapysinq.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.pathToProgramming.soapysinq.model.SinkDetails;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.Thread.sleep;

@Service
@Slf4j
public class SinqService {

    private static final Map<String, SinkDetails> sinkDetails = new HashMap<>();

    @PostConstruct
    public void initialize() {
        SinkDetails sinq1 = SinkDetails.builder()
                .modelNumber("VT3322G2")
                .skuNumber("1004490740")
                .modelName("Glacier Bay")
                .description("All-in-One Dual Mount Stainless Steel 33 in. 2-Hole Double Bowl Kitchen Sink Kit with Faucet")
                .price(269.00)
                .depth(22.00)
                .length(33.00)
                .numOfBowls(2)
                .build();

        SinkDetails sinq2 = SinkDetails.builder()
                .modelNumber("KCH-1000")
                .skuNumber("1003400994")
                .modelName("Kraus")
                .description("Loften All-in-One Dual Mount Drop-In Stainless Steel 33 in. 2-Hole Single Bowl Kitchen Sink with Pull Down Faucet")
                .price(399.00)
                .depth(22.00)
                .length(33.00)
                .numOfBowls(1)
                .build();

        SinkDetails sinq3 = SinkDetails.builder()
                .modelNumber("HDDBD33229TR3")
                .skuNumber("1003344884")
                .modelName("Elkay")
                .description("Avenue Drop-in/Undermount Stainless Steel 33 in. 50/50 Double Bowl Kitchen Sink with Bottom Grid")
                .price(229.00)
                .depth(22.00)
                .length(33.00)
                .numOfBowls(2)
                .build();

        sinkDetails.put(sinq1.getModelNumber(), sinq1);
        sinkDetails.put(sinq2.getModelNumber(), sinq2);
        sinkDetails.put(sinq3.getModelNumber(), sinq3);
    }

    public SinkDetails findSinkDetailsByModelNumber(String modelNumber) {
        simulateDelay();
        return sinkDetails.get(modelNumber);
    }

    private void simulateDelay() {
        int milliSeconds = new Random().nextInt(6000 - 1000) + 1000;

        try {
            sleep(milliSeconds);
        } catch (InterruptedException e) {
            log.error("Sleep Issue", e);
        }
    }
}
