/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.example;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Booking extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1084524581073948432L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Booking\",\"namespace\":\"org.example\",\"fields\":[{\"name\":\"reservation_id\",\"type\":\"int\"},{\"name\":\"hotel_id\",\"type\":\"int\"},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nights_booked\",\"type\":\"int\"},{\"name\":\"booking_amount\",\"type\":\"double\"},{\"name\":\"currency\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Booking> ENCODER =
      new BinaryMessageEncoder<Booking>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Booking> DECODER =
      new BinaryMessageDecoder<Booking>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Booking> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Booking> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Booking>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Booking to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Booking from a ByteBuffer. */
  public static Booking fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int reservation_id;
   private int hotel_id;
   private java.lang.String city;
   private int nights_booked;
   private double booking_amount;
   private java.lang.String currency;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Booking() {}

  /**
   * All-args constructor.
   * @param reservation_id The new value for reservation_id
   * @param hotel_id The new value for hotel_id
   * @param city The new value for city
   * @param nights_booked The new value for nights_booked
   * @param booking_amount The new value for booking_amount
   * @param currency The new value for currency
   */
  public Booking(java.lang.Integer reservation_id, java.lang.Integer hotel_id, java.lang.String city, java.lang.Integer nights_booked, java.lang.Double booking_amount, java.lang.String currency) {
    this.reservation_id = reservation_id;
    this.hotel_id = hotel_id;
    this.city = city;
    this.nights_booked = nights_booked;
    this.booking_amount = booking_amount;
    this.currency = currency;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reservation_id;
    case 1: return hotel_id;
    case 2: return city;
    case 3: return nights_booked;
    case 4: return booking_amount;
    case 5: return currency;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reservation_id = (java.lang.Integer)value$; break;
    case 1: hotel_id = (java.lang.Integer)value$; break;
    case 2: city = (java.lang.String)value$; break;
    case 3: nights_booked = (java.lang.Integer)value$; break;
    case 4: booking_amount = (java.lang.Double)value$; break;
    case 5: currency = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reservation_id' field.
   * @return The value of the 'reservation_id' field.
   */
  public java.lang.Integer getReservationId() {
    return reservation_id;
  }


  /**
   * Gets the value of the 'hotel_id' field.
   * @return The value of the 'hotel_id' field.
   */
  public java.lang.Integer getHotelId() {
    return hotel_id;
  }


  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.String getCity() {
    return city;
  }


  /**
   * Gets the value of the 'nights_booked' field.
   * @return The value of the 'nights_booked' field.
   */
  public java.lang.Integer getNightsBooked() {
    return nights_booked;
  }


  /**
   * Gets the value of the 'booking_amount' field.
   * @return The value of the 'booking_amount' field.
   */
  public java.lang.Double getBookingAmount() {
    return booking_amount;
  }


  /**
   * Gets the value of the 'currency' field.
   * @return The value of the 'currency' field.
   */
  public java.lang.String getCurrency() {
    return currency;
  }


  /**
   * Creates a new Booking RecordBuilder.
   * @return A new Booking RecordBuilder
   */
  public static org.example.Booking.Builder newBuilder() {
    return new org.example.Booking.Builder();
  }

  /**
   * Creates a new Booking RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Booking RecordBuilder
   */
  public static org.example.Booking.Builder newBuilder(org.example.Booking.Builder other) {
    return new org.example.Booking.Builder(other);
  }

  /**
   * Creates a new Booking RecordBuilder by copying an existing Booking instance.
   * @param other The existing instance to copy.
   * @return A new Booking RecordBuilder
   */
  public static org.example.Booking.Builder newBuilder(org.example.Booking other) {
    return new org.example.Booking.Builder(other);
  }

  /**
   * RecordBuilder for Booking instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Booking>
    implements org.apache.avro.data.RecordBuilder<Booking> {

    private int reservation_id;
    private int hotel_id;
    private java.lang.String city;
    private int nights_booked;
    private double booking_amount;
    private java.lang.String currency;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.example.Booking.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reservation_id)) {
        this.reservation_id = data().deepCopy(fields()[0].schema(), other.reservation_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.hotel_id)) {
        this.hotel_id = data().deepCopy(fields()[1].schema(), other.hotel_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.nights_booked)) {
        this.nights_booked = data().deepCopy(fields()[3].schema(), other.nights_booked);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.booking_amount)) {
        this.booking_amount = data().deepCopy(fields()[4].schema(), other.booking_amount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.currency)) {
        this.currency = data().deepCopy(fields()[5].schema(), other.currency);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Booking instance
     * @param other The existing instance to copy.
     */
    private Builder(org.example.Booking other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.reservation_id)) {
        this.reservation_id = data().deepCopy(fields()[0].schema(), other.reservation_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.hotel_id)) {
        this.hotel_id = data().deepCopy(fields()[1].schema(), other.hotel_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.nights_booked)) {
        this.nights_booked = data().deepCopy(fields()[3].schema(), other.nights_booked);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.booking_amount)) {
        this.booking_amount = data().deepCopy(fields()[4].schema(), other.booking_amount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.currency)) {
        this.currency = data().deepCopy(fields()[5].schema(), other.currency);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'reservation_id' field.
      * @return The value.
      */
    public java.lang.Integer getReservationId() {
      return reservation_id;
    }

    /**
      * Sets the value of the 'reservation_id' field.
      * @param value The value of 'reservation_id'.
      * @return This builder.
      */
    public org.example.Booking.Builder setReservationId(int value) {
      validate(fields()[0], value);
      this.reservation_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reservation_id' field has been set.
      * @return True if the 'reservation_id' field has been set, false otherwise.
      */
    public boolean hasReservationId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reservation_id' field.
      * @return This builder.
      */
    public org.example.Booking.Builder clearReservationId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'hotel_id' field.
      * @return The value.
      */
    public java.lang.Integer getHotelId() {
      return hotel_id;
    }

    /**
      * Sets the value of the 'hotel_id' field.
      * @param value The value of 'hotel_id'.
      * @return This builder.
      */
    public org.example.Booking.Builder setHotelId(int value) {
      validate(fields()[1], value);
      this.hotel_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'hotel_id' field has been set.
      * @return True if the 'hotel_id' field has been set, false otherwise.
      */
    public boolean hasHotelId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'hotel_id' field.
      * @return This builder.
      */
    public org.example.Booking.Builder clearHotelId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.String getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public org.example.Booking.Builder setCity(java.lang.String value) {
      validate(fields()[2], value);
      this.city = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public org.example.Booking.Builder clearCity() {
      city = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'nights_booked' field.
      * @return The value.
      */
    public java.lang.Integer getNightsBooked() {
      return nights_booked;
    }

    /**
      * Sets the value of the 'nights_booked' field.
      * @param value The value of 'nights_booked'.
      * @return This builder.
      */
    public org.example.Booking.Builder setNightsBooked(int value) {
      validate(fields()[3], value);
      this.nights_booked = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'nights_booked' field has been set.
      * @return True if the 'nights_booked' field has been set, false otherwise.
      */
    public boolean hasNightsBooked() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'nights_booked' field.
      * @return This builder.
      */
    public org.example.Booking.Builder clearNightsBooked() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'booking_amount' field.
      * @return The value.
      */
    public java.lang.Double getBookingAmount() {
      return booking_amount;
    }

    /**
      * Sets the value of the 'booking_amount' field.
      * @param value The value of 'booking_amount'.
      * @return This builder.
      */
    public org.example.Booking.Builder setBookingAmount(double value) {
      validate(fields()[4], value);
      this.booking_amount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'booking_amount' field has been set.
      * @return True if the 'booking_amount' field has been set, false otherwise.
      */
    public boolean hasBookingAmount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'booking_amount' field.
      * @return This builder.
      */
    public org.example.Booking.Builder clearBookingAmount() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * @return The value.
      */
    public java.lang.String getCurrency() {
      return currency;
    }

    /**
      * Sets the value of the 'currency' field.
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public org.example.Booking.Builder setCurrency(java.lang.String value) {
      validate(fields()[5], value);
      this.currency = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'currency' field.
      * @return This builder.
      */
    public org.example.Booking.Builder clearCurrency() {
      currency = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Booking build() {
      try {
        Booking record = new Booking();
        record.reservation_id = fieldSetFlags()[0] ? this.reservation_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.hotel_id = fieldSetFlags()[1] ? this.hotel_id : (java.lang.Integer) defaultValue(fields()[1]);
        record.city = fieldSetFlags()[2] ? this.city : (java.lang.String) defaultValue(fields()[2]);
        record.nights_booked = fieldSetFlags()[3] ? this.nights_booked : (java.lang.Integer) defaultValue(fields()[3]);
        record.booking_amount = fieldSetFlags()[4] ? this.booking_amount : (java.lang.Double) defaultValue(fields()[4]);
        record.currency = fieldSetFlags()[5] ? this.currency : (java.lang.String) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Booking>
    WRITER$ = (org.apache.avro.io.DatumWriter<Booking>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Booking>
    READER$ = (org.apache.avro.io.DatumReader<Booking>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
