package cds.gen.sap.capire.incidents;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("sap.capire.incidents.Urgency.texts")
@Generated("cds-maven-plugin")
public interface UrgencyTexts extends CdsData {
  String LOCALE = "locale";

  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String getLocale();

  void setLocale(String locale);

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  UrgencyTexts_ ref();

  static UrgencyTexts create() {
    return Struct.create(UrgencyTexts.class);
  }

  static UrgencyTexts of(Map<String, Object> map) {
    return Struct.access(map).as(UrgencyTexts.class);
  }
}
