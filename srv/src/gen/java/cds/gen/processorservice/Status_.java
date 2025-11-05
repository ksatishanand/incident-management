package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Status")
@Generated("cds-maven-plugin")
public interface Status_ extends LinkedStructuredType<Status, Status_> {
  String CDS_NAME = "ProcessorService.Status";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  ElementRef<Integer> criticality();

  StatusTexts_ texts();

  StatusTexts_ texts(Function<StatusTexts_, CqnPredicate> filter);

  StatusTexts_ localized();

  StatusTexts_ localized(Function<StatusTexts_, CqnPredicate> filter);
}
