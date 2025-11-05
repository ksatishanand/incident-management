package cds.gen.sap.capire.incidents;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("sap.capire.incidents.Urgency.texts")
@Generated("cds-maven-plugin")
public interface UrgencyTexts_ extends LinkedStructuredType<UrgencyTexts, UrgencyTexts_> {
  String CDS_NAME = "sap.capire.incidents.Urgency.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
