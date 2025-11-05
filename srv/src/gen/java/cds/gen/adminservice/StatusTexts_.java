package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.LinkedStructuredType;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("AdminService.Status.texts")
@Generated("cds-maven-plugin")
public interface StatusTexts_ extends LinkedStructuredType<StatusTexts, StatusTexts_> {
  String CDS_NAME = "AdminService.Status.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
