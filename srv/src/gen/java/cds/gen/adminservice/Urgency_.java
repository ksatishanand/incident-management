package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("AdminService.Urgency")
@Generated("cds-maven-plugin")
public interface Urgency_ extends LinkedStructuredType<Urgency, Urgency_> {
  String CDS_NAME = "AdminService.Urgency";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  UrgencyTexts_ texts();

  UrgencyTexts_ texts(Function<UrgencyTexts_, CqnPredicate> filter);

  UrgencyTexts_ localized();

  UrgencyTexts_ localized(Function<UrgencyTexts_, CqnPredicate> filter);
}
