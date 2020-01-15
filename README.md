```
 ____    _____   ______  ____    __    __        ____    ______   __  __  _____      
/\  _`\ /\  __`\/\  _  \/\  _`\ /\ \  /\ \      /\  _`\ /\__  _\ /\ \/\ \/\  __`\    
\ \,\L\_\ \ \/\ \ \ \L\ \ \ \L\ \ `\`\\/'/      \ \,\L\_\/_/\ \/ \ \ `\\ \ \ \/\ \   
 \/_\__ \\ \ \ \ \ \  __ \ \ ,__/`\ `\ /' _______\/_\__ \  \ \ \  \ \ , ` \ \ \ \ \  
   /\ \L\ \ \ \_\ \ \ \/\ \ \ \/   `\ \ \/\______\ /\ \L\ \ \_\ \__\ \ \`\ \ \ \\'\\ 
   \ `\____\ \_____\ \_\ \_\ \_\     \ \_\/______/ \ `\____\/\_____\\ \_\ \_\ \___\_\
    \/_____/\/_____/\/_/\/_/\/_/      \/_/          \/_____/\/_____/ \/_/\/_/\/__//_/
    
```    


## Sample Curl Request:

```
curl --request POST \
  --url http://localhost:8091/ws \
  --header 'content-type: text/xml' \
  --data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:ss="http://pathToProgramming.tech/soapy-sinq">
    <soapenv:Header/>
    <soapenv:Body>
        <ss:getSinqRequest>
            <ss:modelNumber>HDDBD33229TR3</ss:modelNumber>
        </ss:getSinqRequest>
    </soapenv:Body>
</soapenv:Envelope>
'
```

## Web Services Description Language (WSDL) 
Run the app and navigate to `http://localhost:8091/ws/sink.wsdl` to see the schema.                                                                                     