package cds.gen.processorservice;

import cds.gen.draft.DraftAdministrativeDataDraftMessage;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Incidents")
@Generated("cds-maven-plugin")
public interface Incidents_ extends LinkedStructuredType<Incidents, Incidents_> {
  String ID = "ID";

  String CUSTOMER_ID = "customer_ID";

  String URGENCY_CODE = "urgency_code";

  String STATUS_CODE = "status_code";

  String IS_ACTIVE_ENTITY = "IsActiveEntity";

  String HAS_ACTIVE_ENTITY = "HasActiveEntity";

  String HAS_DRAFT_ENTITY = "HasDraftEntity";

  String DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID = "DraftAdministrativeData_DraftUUID";

  String DRAFT_MESSAGES = "DraftMessages";

  String CDS_NAME = "ProcessorService.Incidents";

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

  @CdsName(IS_ACTIVE_ENTITY)
  ElementRef<Boolean> IsActiveEntity();

  @CdsName(HAS_ACTIVE_ENTITY)
  ElementRef<Boolean> HasActiveEntity();

  @CdsName(HAS_DRAFT_ENTITY)
  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  ElementRef<String> DraftAdministrativeData_DraftUUID();

  Incidents_ SiblingEntity();

  Incidents_ SiblingEntity(Function<Incidents_, CqnPredicate> filter);

  @CdsName(DRAFT_MESSAGES)
  ElementRef<Collection<DraftAdministrativeDataDraftMessage>> DraftMessages();

  @CdsName("ProcessorService.Incidents.conversation")
  interface Conversation_ extends LinkedStructuredType<Incidents.Conversation, Conversation_> {
    String ID = "ID";

    String CDS_NAME = "ProcessorService.Incidents.conversation";

    @CdsName(ID)
    ElementRef<String> ID();

    ElementRef<Instant> timestamp();

    ElementRef<String> author();

    ElementRef<String> message();
  }
}
