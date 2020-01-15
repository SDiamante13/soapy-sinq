package tech.pathToProgramming.soapysinq.endpoint;

import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tech.pathToProgramming.soapysinq.model.GetSinqRequest;
import tech.pathToProgramming.soapysinq.model.GetSinqResponse;
import tech.pathToProgramming.soapysinq.model.SinkDetails;
import tech.pathToProgramming.soapysinq.service.SinqService;

@Endpoint
@RequiredArgsConstructor
public class SoapySinqEndpoint {

    private final SinqService sinqService;

    @PayloadRoot(namespace = "http://pathToProgramming.tech/soapy-sinq",
            localPart = "getSinqRequest")
    @ResponsePayload
    public GetSinqResponse getSinqRequest(@RequestPayload GetSinqRequest sinqRequest) {
        SinkDetails sinkDetails = sinqService.findSinkDetailsByModelNumber(sinqRequest.getModelNumber());

        GetSinqResponse sinqResponse = new GetSinqResponse();
        sinqResponse.setSinkDetails(sinkDetails);
        return sinqResponse;
    }
}
