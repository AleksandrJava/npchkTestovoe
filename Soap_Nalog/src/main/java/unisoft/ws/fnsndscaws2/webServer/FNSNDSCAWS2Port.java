
package unisoft.ws.fnsndscaws2.webServer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import unisoft.ws.fnsndscaws2.request.NdsRequest2;
import unisoft.ws.fnsndscaws2.response.NdsResponse2;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FNSNDSCAWS2_Port", targetNamespace = "http://ws.unisoft")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    unisoft.ws.fnsndscaws2.request.ObjectFactory.class,
    unisoft.ws.fnsndscaws2.response.ObjectFactory.class
})
public interface FNSNDSCAWS2Port {


    /**
     * 
     * @param npIn
     * @return
     *     returns unisoft.ws.fnsndscaws2.response.NdsResponse2
     */
    @WebMethod(operationName = "NdsRequest2", action = "NdsRequest2")
    @WebResult(name = "NdsResponse2", targetNamespace = "http://ws.unisoft/FNSNDSCAWS2/Response", partName = "np_out")
    public NdsResponse2 ndsRequest2(
        @WebParam(name = "NdsRequest2", targetNamespace = "http://ws.unisoft/FNSNDSCAWS2/Request", partName = "np_in")
        NdsRequest2 npIn);

}
