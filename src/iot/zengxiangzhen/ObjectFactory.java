
package iot.zengxiangzhen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iot.zengxiangzhen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListDevicesResponse_QNAME = new QName("http://zengxiangzhen.iot/", "listDevicesResponse");
    private final static QName _QueryDevice_QNAME = new QName("http://zengxiangzhen.iot/", "queryDevice");
    private final static QName _ReportData_QNAME = new QName("http://zengxiangzhen.iot/", "reportData");
    private final static QName _ListDevices_QNAME = new QName("http://zengxiangzhen.iot/", "listDevices");
    private final static QName _QueryDeviceResponse_QNAME = new QName("http://zengxiangzhen.iot/", "queryDeviceResponse");
    private final static QName _ReportDataResponse_QNAME = new QName("http://zengxiangzhen.iot/", "reportDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iot.zengxiangzhen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListDevicesResponse }
     * 
     */
    public ListDevicesResponse createListDevicesResponse() {
        return new ListDevicesResponse();
    }

    /**
     * Create an instance of {@link QueryDevice }
     * 
     */
    public QueryDevice createQueryDevice() {
        return new QueryDevice();
    }

    /**
     * Create an instance of {@link ReportData }
     * 
     */
    public ReportData createReportData() {
        return new ReportData();
    }

    /**
     * Create an instance of {@link ListDevices }
     * 
     */
    public ListDevices createListDevices() {
        return new ListDevices();
    }

    /**
     * Create an instance of {@link QueryDeviceResponse }
     * 
     */
    public QueryDeviceResponse createQueryDeviceResponse() {
        return new QueryDeviceResponse();
    }

    /**
     * Create an instance of {@link ReportDataResponse }
     * 
     */
    public ReportDataResponse createReportDataResponse() {
        return new ReportDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDevicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zengxiangzhen.iot/", name = "listDevicesResponse")
    public JAXBElement<ListDevicesResponse> createListDevicesResponse(ListDevicesResponse value) {
        return new JAXBElement<ListDevicesResponse>(_ListDevicesResponse_QNAME, ListDevicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zengxiangzhen.iot/", name = "queryDevice")
    public JAXBElement<QueryDevice> createQueryDevice(QueryDevice value) {
        return new JAXBElement<QueryDevice>(_QueryDevice_QNAME, QueryDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zengxiangzhen.iot/", name = "reportData")
    public JAXBElement<ReportData> createReportData(ReportData value) {
        return new JAXBElement<ReportData>(_ReportData_QNAME, ReportData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDevices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zengxiangzhen.iot/", name = "listDevices")
    public JAXBElement<ListDevices> createListDevices(ListDevices value) {
        return new JAXBElement<ListDevices>(_ListDevices_QNAME, ListDevices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zengxiangzhen.iot/", name = "queryDeviceResponse")
    public JAXBElement<QueryDeviceResponse> createQueryDeviceResponse(QueryDeviceResponse value) {
        return new JAXBElement<QueryDeviceResponse>(_QueryDeviceResponse_QNAME, QueryDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zengxiangzhen.iot/", name = "reportDataResponse")
    public JAXBElement<ReportDataResponse> createReportDataResponse(ReportDataResponse value) {
        return new JAXBElement<ReportDataResponse>(_ReportDataResponse_QNAME, ReportDataResponse.class, null, value);
    }

}
