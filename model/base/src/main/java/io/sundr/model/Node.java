/*
 * Copyright 2016 The original authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sundr.model;

public interface Node {

  String DOT = ".";
  String COMA = ",";
  String SEMICOLN = ";";
  String SPACE = " ";
  String NEWLINE = "\n";

  String AT = "@";

  String LT = "<";
  String EQ = "=";
  String GT = ">";

  String Q = "'";
  String DQ = "\"";

  String OC = "/**";
  String STAR = "*";
  String CLP = " * ";
  String CC = " */";

  String OP = "(";
  String CP = ")";

  String OB = "{";
  String CB = "}";

  String VARARG = "...";
  String THROWS = "throws";

  String EXTENDS = "extends";
  String IMPLEMENTS = "implements";

  String JAVA_LANG = "java.lang";
  String JAVA_LANG_STRING = "java.lang.String";
  String JAVA_LANG_OBJECT = "java.lang.Object";
  String JAVA_LANG_ENUM = "java.lang.Enum";

}
