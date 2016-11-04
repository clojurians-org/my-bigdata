/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.hive.hbase.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HomePhone extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HomePhone\",\"namespace\":\"org.apache.hadoop.hive.hbase.avro\",\"fields\":[{\"name\":\"areaCode\",\"type\":\"long\"},{\"name\":\"number\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long areaCode;
  @Deprecated public long number;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HomePhone() {}

  /**
   * All-args constructor.
   */
  public HomePhone(java.lang.Long areaCode, java.lang.Long number) {
    this.areaCode = areaCode;
    this.number = number;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return areaCode;
    case 1: return number;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: areaCode = (java.lang.Long)value$; break;
    case 1: number = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'areaCode' field.
   */
  public java.lang.Long getAreaCode() {
    return areaCode;
  }

  /**
   * Sets the value of the 'areaCode' field.
   * @param value the value to set.
   */
  public void setAreaCode(java.lang.Long value) {
    this.areaCode = value;
  }

  /**
   * Gets the value of the 'number' field.
   */
  public java.lang.Long getNumber() {
    return number;
  }

  /**
   * Sets the value of the 'number' field.
   * @param value the value to set.
   */
  public void setNumber(java.lang.Long value) {
    this.number = value;
  }

  /** Creates a new HomePhone RecordBuilder */
  public static org.apache.hadoop.hive.hbase.avro.HomePhone.Builder newBuilder() {
    return new org.apache.hadoop.hive.hbase.avro.HomePhone.Builder();
  }
  
  /** Creates a new HomePhone RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.hive.hbase.avro.HomePhone.Builder newBuilder(org.apache.hadoop.hive.hbase.avro.HomePhone.Builder other) {
    return new org.apache.hadoop.hive.hbase.avro.HomePhone.Builder(other);
  }
  
  /** Creates a new HomePhone RecordBuilder by copying an existing HomePhone instance */
  public static org.apache.hadoop.hive.hbase.avro.HomePhone.Builder newBuilder(org.apache.hadoop.hive.hbase.avro.HomePhone other) {
    return new org.apache.hadoop.hive.hbase.avro.HomePhone.Builder(other);
  }
  
  /**
   * RecordBuilder for HomePhone instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HomePhone>
    implements org.apache.avro.data.RecordBuilder<HomePhone> {

    private long areaCode;
    private long number;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.hive.hbase.avro.HomePhone.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.hive.hbase.avro.HomePhone.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.areaCode)) {
        this.areaCode = data().deepCopy(fields()[0].schema(), other.areaCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.number)) {
        this.number = data().deepCopy(fields()[1].schema(), other.number);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HomePhone instance */
    private Builder(org.apache.hadoop.hive.hbase.avro.HomePhone other) {
            super(org.apache.hadoop.hive.hbase.avro.HomePhone.SCHEMA$);
      if (isValidValue(fields()[0], other.areaCode)) {
        this.areaCode = data().deepCopy(fields()[0].schema(), other.areaCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.number)) {
        this.number = data().deepCopy(fields()[1].schema(), other.number);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'areaCode' field */
    public java.lang.Long getAreaCode() {
      return areaCode;
    }
    
    /** Sets the value of the 'areaCode' field */
    public org.apache.hadoop.hive.hbase.avro.HomePhone.Builder setAreaCode(long value) {
      validate(fields()[0], value);
      this.areaCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'areaCode' field has been set */
    public boolean hasAreaCode() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'areaCode' field */
    public org.apache.hadoop.hive.hbase.avro.HomePhone.Builder clearAreaCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'number' field */
    public java.lang.Long getNumber() {
      return number;
    }
    
    /** Sets the value of the 'number' field */
    public org.apache.hadoop.hive.hbase.avro.HomePhone.Builder setNumber(long value) {
      validate(fields()[1], value);
      this.number = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'number' field has been set */
    public boolean hasNumber() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'number' field */
    public org.apache.hadoop.hive.hbase.avro.HomePhone.Builder clearNumber() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HomePhone build() {
      try {
        HomePhone record = new HomePhone();
        record.areaCode = fieldSetFlags()[0] ? this.areaCode : (java.lang.Long) defaultValue(fields()[0]);
        record.number = fieldSetFlags()[1] ? this.number : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
