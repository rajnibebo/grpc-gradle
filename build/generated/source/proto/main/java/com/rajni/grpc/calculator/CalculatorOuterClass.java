// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.rajni.grpc.calculator;

public final class CalculatorOuterClass {
  private CalculatorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_Calculator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_Calculator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_CalculatorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_CalculatorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_CalculatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_CalculatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_AverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_AverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_AverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_AverageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033calculator/calculator.proto\022\ncalculato" +
      "r\"2\n\nCalculator\022\021\n\targument1\030\001 \001(\005\022\021\n\tar" +
      "gument2\030\002 \001(\005\"<\n\021CalculatorRequest\022\'\n\007re" +
      "quest\030\001 \001(\0132\026.calculator.Calculator\"$\n\022C" +
      "alculatorResponse\022\016\n\006result\030\001 \001(\005\"1\n\037Pri" +
      "meNumberDecompositionRequest\022\016\n\006number\030\001" +
      " \001(\005\"8\n PrimeNumberDecompositionResponse" +
      "\022\024\n\014prime_factor\030\001 \001(\005\" \n\016AverageRequest" +
      "\022\016\n\006number\030\001 \001(\005\"\"\n\017AverageResponse\022\017\n\007a" +
      "verage\030\001 \001(\0012\253\002\n\021CalculatorService\022F\n\003su" +
      "m\022\035.calculator.CalculatorRequest\032\036.calcu" +
      "lator.CalculatorResponse\"\000\022\177\n\036primeNumbe" +
      "rDecompositionFactor\022+.calculator.PrimeN" +
      "umberDecompositionRequest\032,.calculator.P" +
      "rimeNumberDecompositionResponse\"\0000\001\022M\n\016c" +
      "omputeAverage\022\032.calculator.AverageReques" +
      "t\032\033.calculator.AverageResponse\"\000(\001B\035\n\031co" +
      "m.rajni.grpc.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_Calculator_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_Calculator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_Calculator_descriptor,
        new java.lang.String[] { "Argument1", "Argument2", });
    internal_static_calculator_CalculatorRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_CalculatorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_CalculatorRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_calculator_CalculatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_calculator_CalculatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_CalculatorResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionResponse_descriptor,
        new java.lang.String[] { "PrimeFactor", });
    internal_static_calculator_AverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_calculator_AverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_AverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_AverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_calculator_AverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_AverageResponse_descriptor,
        new java.lang.String[] { "Average", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
