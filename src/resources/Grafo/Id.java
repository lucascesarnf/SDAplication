/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package resources.Grafo;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-11-09")
public class Id implements org.apache.thrift.TBase<Id, Id._Fields>, java.io.Serializable, Cloneable, Comparable<Id> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Id");

  private static final org.apache.thrift.protocol.TField NOME1_FIELD_DESC = new org.apache.thrift.protocol.TField("nome1", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NOME2_FIELD_DESC = new org.apache.thrift.protocol.TField("nome2", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new IdStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new IdTupleSchemeFactory();

  public int nome1; // required
  public int nome2; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOME1((short)1, "nome1"),
    NOME2((short)2, "nome2");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOME1
          return NOME1;
        case 2: // NOME2
          return NOME2;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NOME1_ISSET_ID = 0;
  private static final int __NOME2_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOME1, new org.apache.thrift.meta_data.FieldMetaData("nome1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.NOME2, new org.apache.thrift.meta_data.FieldMetaData("nome2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Id.class, metaDataMap);
  }

  public Id() {
  }

  public Id(
    int nome1,
    int nome2)
  {
    this();
    this.nome1 = nome1;
    setNome1IsSet(true);
    this.nome2 = nome2;
    setNome2IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Id(Id other) {
    __isset_bitfield = other.__isset_bitfield;
    this.nome1 = other.nome1;
    this.nome2 = other.nome2;
  }

  public Id deepCopy() {
    return new Id(this);
  }

  @Override
  public void clear() {
    setNome1IsSet(false);
    this.nome1 = 0;
    setNome2IsSet(false);
    this.nome2 = 0;
  }

  public int getNome1() {
    return this.nome1;
  }

  public Id setNome1(int nome1) {
    this.nome1 = nome1;
    setNome1IsSet(true);
    return this;
  }

  public void unsetNome1() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOME1_ISSET_ID);
  }

  /** Returns true if field nome1 is set (has been assigned a value) and false otherwise */
  public boolean isSetNome1() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOME1_ISSET_ID);
  }

  public void setNome1IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOME1_ISSET_ID, value);
  }

  public int getNome2() {
    return this.nome2;
  }

  public Id setNome2(int nome2) {
    this.nome2 = nome2;
    setNome2IsSet(true);
    return this;
  }

  public void unsetNome2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOME2_ISSET_ID);
  }

  /** Returns true if field nome2 is set (has been assigned a value) and false otherwise */
  public boolean isSetNome2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOME2_ISSET_ID);
  }

  public void setNome2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOME2_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NOME1:
      if (value == null) {
        unsetNome1();
      } else {
        setNome1((java.lang.Integer)value);
      }
      break;

    case NOME2:
      if (value == null) {
        unsetNome2();
      } else {
        setNome2((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NOME1:
      return getNome1();

    case NOME2:
      return getNome2();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NOME1:
      return isSetNome1();
    case NOME2:
      return isSetNome2();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Id)
      return this.equals((Id)that);
    return false;
  }

  public boolean equals(Id that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nome1 = true;
    boolean that_present_nome1 = true;
    if (this_present_nome1 || that_present_nome1) {
      if (!(this_present_nome1 && that_present_nome1))
        return false;
      if (this.nome1 != that.nome1)
        return false;
    }

    boolean this_present_nome2 = true;
    boolean that_present_nome2 = true;
    if (this_present_nome2 || that_present_nome2) {
      if (!(this_present_nome2 && that_present_nome2))
        return false;
      if (this.nome2 != that.nome2)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + nome1;

    hashCode = hashCode * 8191 + nome2;

    return hashCode;
  }

  @Override
  public int compareTo(Id other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNome1()).compareTo(other.isSetNome1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNome1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nome1, other.nome1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNome2()).compareTo(other.isSetNome2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNome2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nome2, other.nome2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Id(");
    boolean first = true;

    sb.append("nome1:");
    sb.append(this.nome1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nome2:");
    sb.append(this.nome2);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IdStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public IdStandardScheme getScheme() {
      return new IdStandardScheme();
    }
  }

  private static class IdStandardScheme extends org.apache.thrift.scheme.StandardScheme<Id> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Id struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOME1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nome1 = iprot.readI32();
              struct.setNome1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOME2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nome2 = iprot.readI32();
              struct.setNome2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Id struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NOME1_FIELD_DESC);
      oprot.writeI32(struct.nome1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NOME2_FIELD_DESC);
      oprot.writeI32(struct.nome2);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IdTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public IdTupleScheme getScheme() {
      return new IdTupleScheme();
    }
  }

  private static class IdTupleScheme extends org.apache.thrift.scheme.TupleScheme<Id> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Id struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNome1()) {
        optionals.set(0);
      }
      if (struct.isSetNome2()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNome1()) {
        oprot.writeI32(struct.nome1);
      }
      if (struct.isSetNome2()) {
        oprot.writeI32(struct.nome2);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Id struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.nome1 = iprot.readI32();
        struct.setNome1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.nome2 = iprot.readI32();
        struct.setNome2IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

