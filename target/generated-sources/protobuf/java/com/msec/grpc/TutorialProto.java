// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tutorial.proto

package com.msec.grpc;

public final class TutorialProto {
  private TutorialProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Bericht_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Bericht_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_ChatClient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_ChatClient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Registratie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Registratie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_RegistratieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_RegistratieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016tutorial.proto\022\010tutorial\"*\n\007Bericht\022\017\n" +
      "\007message\030\001 \001(\t\022\016\n\006zender\030\002 \001(\t\"\032\n\nChatCl" +
      "ient\022\014\n\004naam\030\001 \001(\t\"\033\n\013Registratie\022\014\n\004naa" +
      "m\030\001 \001(\t\"*\n\023RegistratieResponse\022\023\n\013bevest" +
      "iging\030\001 \001(\010\"\007\n\005Empty2\277\001\n\004Chat\0223\n\013sendMes" +
      "sage\022\021.tutorial.Bericht\032\017.tutorial.Empty" +
      "\"\000\022B\n\010register\022\025.tutorial.Registratie\032\035." +
      "tutorial.RegistratieResponse\"\000\022>\n\017receiv" +
      "eMessages\022\024.tutorial.ChatClient\032\021.tutori" +
      "al.Bericht\"\0000\001B&\n\rcom.msec.grpcB\rTutoria",
      "lProtoP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tutorial_Bericht_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Bericht_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Bericht_descriptor,
        new java.lang.String[] { "Message", "Zender", });
    internal_static_tutorial_ChatClient_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_ChatClient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_ChatClient_descriptor,
        new java.lang.String[] { "Naam", });
    internal_static_tutorial_Registratie_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tutorial_Registratie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Registratie_descriptor,
        new java.lang.String[] { "Naam", });
    internal_static_tutorial_RegistratieResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tutorial_RegistratieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_RegistratieResponse_descriptor,
        new java.lang.String[] { "Bevestiging", });
    internal_static_tutorial_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tutorial_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
