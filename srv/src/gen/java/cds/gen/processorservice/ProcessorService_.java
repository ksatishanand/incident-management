package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("cds-maven-plugin")
@CdsName("ProcessorService")
public interface ProcessorService_ {
  String CDS_NAME = "ProcessorService";

  Class<Urgency_> URGENCY = Urgency_.class;

  Class<Incidents_> INCIDENTS = Incidents_.class;

  Class<UrgencyTexts_> URGENCY_TEXTS = UrgencyTexts_.class;

  Class<StatusTexts_> STATUS_TEXTS = StatusTexts_.class;

  Class<Customers_> CUSTOMERS = Customers_.class;

  Class<Status_> STATUS = Status_.class;

  Class<DraftAdministrativeData_> DRAFT_ADMINISTRATIVE_DATA = DraftAdministrativeData_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;
}
