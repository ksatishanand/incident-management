package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("AdminService.Incidents")
@Generated("cds-maven-plugin")
public interface Incidents_ extends LinkedStructuredType<Incidents, Incidents_> {
  String ID = "ID";

  String CUSTOMER_ID = "customer_ID";

  String URGENCY_CODE = "urgency_code";

  String STATUS_CODE = "status_code";

  String CDS_NAME = "AdminService.Incidents";

  @CdsName(ID)
  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  Customers_ customer();

  Customers_ customer(Function<Customers_, CqnPredicate> filter);

  @CdsName(CUSTOMER_ID)
  ElementRef<String> customer_ID();

  ElementRef<String> title();

  Urgency_ urgency();

  Urgency_ urgency(Function<Urgency_, CqnPredicate> filter);

  @CdsName(URGENCY_CODE)
  ElementRef<String> urgency_code();

  Status_ status();

  Status_ status(Function<Status_, CqnPredicate> filter);

  @CdsName(STATUS_CODE)
  ElementRef<String> status_code();

  Conversation_ conversation();

  Conversation_ conversation(Function<Conversation_, CqnPredicate> filter);

  @CdsName("AdminService.Incidents.conversation")
  interface Conversation_ extends LinkedStructuredType<Incidents.Conversation, Conversation_> {
    String ID = "ID";

    String CDS_NAME = "AdminService.Incidents.conversation";

    @CdsName(ID)
    ElementRef<String> ID();

    ElementRef<Instant> timestamp();

    ElementRef<String> author();

    ElementRef<String> message();
  }
}
