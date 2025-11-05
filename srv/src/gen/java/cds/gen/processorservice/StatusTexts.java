package cds.gen.processorservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Status.texts")
@Generated("cds-maven-plugin")
public interface StatusTexts extends CdsData {
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

  StatusTexts_ ref();

  static StatusTexts create() {
    return Struct.create(StatusTexts.class);
  }

  static StatusTexts of(Map<String, Object> map) {
    return Struct.access(map).as(StatusTexts.class);
  }
}
