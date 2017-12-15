/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.rbc.cloud.hackathon.data;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Customers extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1249623777144464005L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customers\",\"namespace\":\"com.rbc.cloud.hackathon.data\",\"fields\":[{\"name\":\"CustId\",\"type\":\"string\"},{\"name\":\"FirstName\",\"type\":\"string\"},{\"name\":\"LastName\",\"type\":\"string\"},{\"name\":\"CityId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customers> ENCODER =
      new BinaryMessageEncoder<Customers>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customers> DECODER =
      new BinaryMessageDecoder<Customers>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Customers> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Customers> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customers>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Customers to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Customers from a ByteBuffer. */
  public static Customers fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence CustId;
  @Deprecated public java.lang.CharSequence FirstName;
  @Deprecated public java.lang.CharSequence LastName;
  @Deprecated public java.lang.CharSequence CityId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customers() {}

  /**
   * All-args constructor.
   * @param CustId The new value for CustId
   * @param FirstName The new value for FirstName
   * @param LastName The new value for LastName
   * @param CityId The new value for CityId
   */
  public Customers(java.lang.CharSequence CustId, java.lang.CharSequence FirstName, java.lang.CharSequence LastName, java.lang.CharSequence CityId) {
    this.CustId = CustId;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.CityId = CityId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CustId;
    case 1: return FirstName;
    case 2: return LastName;
    case 3: return CityId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CustId = (java.lang.CharSequence)value$; break;
    case 1: FirstName = (java.lang.CharSequence)value$; break;
    case 2: LastName = (java.lang.CharSequence)value$; break;
    case 3: CityId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'CustId' field.
   * @return The value of the 'CustId' field.
   */
  public java.lang.CharSequence getCustId() {
    return CustId;
  }

  /**
   * Sets the value of the 'CustId' field.
   * @param value the value to set.
   */
  public void setCustId(java.lang.CharSequence value) {
    this.CustId = value;
  }

  /**
   * Gets the value of the 'FirstName' field.
   * @return The value of the 'FirstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return FirstName;
  }

  /**
   * Sets the value of the 'FirstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.FirstName = value;
  }

  /**
   * Gets the value of the 'LastName' field.
   * @return The value of the 'LastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return LastName;
  }

  /**
   * Sets the value of the 'LastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.LastName = value;
  }

  /**
   * Gets the value of the 'CityId' field.
   * @return The value of the 'CityId' field.
   */
  public java.lang.CharSequence getCityId() {
    return CityId;
  }

  /**
   * Sets the value of the 'CityId' field.
   * @param value the value to set.
   */
  public void setCityId(java.lang.CharSequence value) {
    this.CityId = value;
  }

  /**
   * Creates a new Customers RecordBuilder.
   * @return A new Customers RecordBuilder
   */
  public static com.rbc.cloud.hackathon.data.Customers.Builder newBuilder() {
    return new com.rbc.cloud.hackathon.data.Customers.Builder();
  }

  /**
   * Creates a new Customers RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customers RecordBuilder
   */
  public static com.rbc.cloud.hackathon.data.Customers.Builder newBuilder(com.rbc.cloud.hackathon.data.Customers.Builder other) {
    return new com.rbc.cloud.hackathon.data.Customers.Builder(other);
  }

  /**
   * Creates a new Customers RecordBuilder by copying an existing Customers instance.
   * @param other The existing instance to copy.
   * @return A new Customers RecordBuilder
   */
  public static com.rbc.cloud.hackathon.data.Customers.Builder newBuilder(com.rbc.cloud.hackathon.data.Customers other) {
    return new com.rbc.cloud.hackathon.data.Customers.Builder(other);
  }

  /**
   * RecordBuilder for Customers instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customers>
    implements org.apache.avro.data.RecordBuilder<Customers> {

    private java.lang.CharSequence CustId;
    private java.lang.CharSequence FirstName;
    private java.lang.CharSequence LastName;
    private java.lang.CharSequence CityId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rbc.cloud.hackathon.data.Customers.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CustId)) {
        this.CustId = data().deepCopy(fields()[0].schema(), other.CustId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.FirstName)) {
        this.FirstName = data().deepCopy(fields()[1].schema(), other.FirstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LastName)) {
        this.LastName = data().deepCopy(fields()[2].schema(), other.LastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CityId)) {
        this.CityId = data().deepCopy(fields()[3].schema(), other.CityId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Customers instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rbc.cloud.hackathon.data.Customers other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.CustId)) {
        this.CustId = data().deepCopy(fields()[0].schema(), other.CustId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.FirstName)) {
        this.FirstName = data().deepCopy(fields()[1].schema(), other.FirstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LastName)) {
        this.LastName = data().deepCopy(fields()[2].schema(), other.LastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CityId)) {
        this.CityId = data().deepCopy(fields()[3].schema(), other.CityId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'CustId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustId() {
      return CustId;
    }

    /**
      * Sets the value of the 'CustId' field.
      * @param value The value of 'CustId'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder setCustId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.CustId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'CustId' field has been set.
      * @return True if the 'CustId' field has been set, false otherwise.
      */
    public boolean hasCustId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'CustId' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder clearCustId() {
      CustId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'FirstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return FirstName;
    }

    /**
      * Sets the value of the 'FirstName' field.
      * @param value The value of 'FirstName'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.FirstName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'FirstName' field has been set.
      * @return True if the 'FirstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'FirstName' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder clearFirstName() {
      FirstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'LastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return LastName;
    }

    /**
      * Sets the value of the 'LastName' field.
      * @param value The value of 'LastName'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.LastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'LastName' field has been set.
      * @return True if the 'LastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'LastName' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder clearLastName() {
      LastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'CityId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCityId() {
      return CityId;
    }

    /**
      * Sets the value of the 'CityId' field.
      * @param value The value of 'CityId'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder setCityId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.CityId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'CityId' field has been set.
      * @return True if the 'CityId' field has been set, false otherwise.
      */
    public boolean hasCityId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'CityId' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Customers.Builder clearCityId() {
      CityId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customers build() {
      try {
        Customers record = new Customers();
        record.CustId = fieldSetFlags()[0] ? this.CustId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.FirstName = fieldSetFlags()[1] ? this.FirstName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.LastName = fieldSetFlags()[2] ? this.LastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.CityId = fieldSetFlags()[3] ? this.CityId : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customers>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customers>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customers>
    READER$ = (org.apache.avro.io.DatumReader<Customers>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
