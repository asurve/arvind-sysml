// Generated from org/apache/sysml/parser/pydml/Pydml.g4 by ANTLR 4.5.3
package org.apache.sysml.parser.pydml;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PydmlParser}.
 */
public interface PydmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PydmlParser#programroot}.
	 * @param ctx the parse tree
	 */
	void enterProgramroot(PydmlParser.ProgramrootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#programroot}.
	 * @param ctx the parse tree
	 */
	void exitProgramroot(PydmlParser.ProgramrootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(PydmlParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(PydmlParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPathStatement(PydmlParser.PathStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPathStatement(PydmlParser.PathStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfdefAssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfdefAssignmentStatement(PydmlParser.IfdefAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfdefAssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfdefAssignmentStatement(PydmlParser.IfdefAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallAssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallAssignmentStatement(PydmlParser.FunctionCallAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallAssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallAssignmentStatement(PydmlParser.FunctionCallAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallMultiAssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallMultiAssignmentStatement(PydmlParser.FunctionCallMultiAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallMultiAssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallMultiAssignmentStatement(PydmlParser.FunctionCallMultiAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PydmlParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PydmlParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PydmlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PydmlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PydmlParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PydmlParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParForStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterParForStatement(PydmlParser.ParForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParForStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitParForStatement(PydmlParser.ParForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PydmlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PydmlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IgnoreNewLine}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreNewLine(PydmlParser.IgnoreNewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IgnoreNewLine}
	 * labeled alternative in {@link PydmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreNewLine(PydmlParser.IgnoreNewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PydmlParser#elifBranch}.
	 * @param ctx the parse tree
	 */
	void enterElifBranch(PydmlParser.ElifBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#elifBranch}.
	 * @param ctx the parse tree
	 */
	void exitElifBranch(PydmlParser.ElifBranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterablePredicateColonExpression}
	 * labeled alternative in {@link PydmlParser#iterablePredicate}.
	 * @param ctx the parse tree
	 */
	void enterIterablePredicateColonExpression(PydmlParser.IterablePredicateColonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterablePredicateColonExpression}
	 * labeled alternative in {@link PydmlParser#iterablePredicate}.
	 * @param ctx the parse tree
	 */
	void exitIterablePredicateColonExpression(PydmlParser.IterablePredicateColonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterablePredicateSeqExpression}
	 * labeled alternative in {@link PydmlParser#iterablePredicate}.
	 * @param ctx the parse tree
	 */
	void enterIterablePredicateSeqExpression(PydmlParser.IterablePredicateSeqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterablePredicateSeqExpression}
	 * labeled alternative in {@link PydmlParser#iterablePredicate}.
	 * @param ctx the parse tree
	 */
	void exitIterablePredicateSeqExpression(PydmlParser.IterablePredicateSeqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InternalFunctionDefExpression}
	 * labeled alternative in {@link PydmlParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterInternalFunctionDefExpression(PydmlParser.InternalFunctionDefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InternalFunctionDefExpression}
	 * labeled alternative in {@link PydmlParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitInternalFunctionDefExpression(PydmlParser.InternalFunctionDefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExternalFunctionDefExpression}
	 * labeled alternative in {@link PydmlParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExternalFunctionDefExpression(PydmlParser.ExternalFunctionDefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExternalFunctionDefExpression}
	 * labeled alternative in {@link PydmlParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExternalFunctionDefExpression(PydmlParser.ExternalFunctionDefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexedExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIndexedExpression(PydmlParser.IndexedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexedExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIndexedExpression(PydmlParser.IndexedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleDataIdentifierExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataIdentifierExpression(PydmlParser.SimpleDataIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleDataIdentifierExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataIdentifierExpression(PydmlParser.SimpleDataIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandlineParamExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCommandlineParamExpression(PydmlParser.CommandlineParamExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandlineParamExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCommandlineParamExpression(PydmlParser.CommandlineParamExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandlinePositionExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCommandlinePositionExpression(PydmlParser.CommandlinePositionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandlinePositionExpression}
	 * labeled alternative in {@link PydmlParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCommandlinePositionExpression(PydmlParser.CommandlinePositionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModIntDivExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModIntDivExpression(PydmlParser.ModIntDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModIntDivExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModIntDivExpression(PydmlParser.ModIntDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PydmlParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PydmlParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanNotExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNotExpression(PydmlParser.BooleanNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanNotExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNotExpression(PydmlParser.BooleanNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(PydmlParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(PydmlParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinFunctionExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinFunctionExpression(PydmlParser.BuiltinFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinFunctionExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinFunctionExpression(PydmlParser.BuiltinFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstIntIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstIntIdExpression(PydmlParser.ConstIntIdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstIntIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstIntIdExpression(PydmlParser.ConstIntIdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(PydmlParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(PydmlParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstStringIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstStringIdExpression(PydmlParser.ConstStringIdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstStringIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstStringIdExpression(PydmlParser.ConstStringIdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTrueExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstTrueExpression(PydmlParser.ConstTrueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTrueExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstTrueExpression(PydmlParser.ConstTrueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(PydmlParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(PydmlParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpression(PydmlParser.MultDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpression(PydmlParser.MultDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalseExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstFalseExpression(PydmlParser.ConstFalseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalseExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstFalseExpression(PydmlParser.ConstFalseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataIdExpression(PydmlParser.DataIdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataIdExpression(PydmlParser.DataIdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(PydmlParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(PydmlParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDoubleIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstDoubleIdExpression(PydmlParser.ConstDoubleIdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDoubleIdExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstDoubleIdExpression(PydmlParser.ConstDoubleIdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanAndExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndExpression(PydmlParser.BooleanAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanAndExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndExpression(PydmlParser.BooleanAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanOrExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrExpression(PydmlParser.BooleanOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanOrExpression}
	 * labeled alternative in {@link PydmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrExpression(PydmlParser.BooleanOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PydmlParser#typedArgNoAssign}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgNoAssign(PydmlParser.TypedArgNoAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#typedArgNoAssign}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgNoAssign(PydmlParser.TypedArgNoAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PydmlParser#parameterizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParameterizedExpression(PydmlParser.ParameterizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#parameterizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParameterizedExpression(PydmlParser.ParameterizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PydmlParser#strictParameterizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictParameterizedExpression(PydmlParser.StrictParameterizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#strictParameterizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictParameterizedExpression(PydmlParser.StrictParameterizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PydmlParser#strictParameterizedKeyValueString}.
	 * @param ctx the parse tree
	 */
	void enterStrictParameterizedKeyValueString(PydmlParser.StrictParameterizedKeyValueStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#strictParameterizedKeyValueString}.
	 * @param ctx the parse tree
	 */
	void exitStrictParameterizedKeyValueString(PydmlParser.StrictParameterizedKeyValueStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PydmlParser#ml_type}.
	 * @param ctx the parse tree
	 */
	void enterMl_type(PydmlParser.Ml_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PydmlParser#ml_type}.
	 * @param ctx the parse tree
	 */
	void exitMl_type(PydmlParser.Ml_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueDataTypeCheck}
	 * labeled alternative in {@link PydmlParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueDataTypeCheck(PydmlParser.ValueDataTypeCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueDataTypeCheck}
	 * labeled alternative in {@link PydmlParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueDataTypeCheck(PydmlParser.ValueDataTypeCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixDataTypeCheck}
	 * labeled alternative in {@link PydmlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDataTypeCheck(PydmlParser.MatrixDataTypeCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixDataTypeCheck}
	 * labeled alternative in {@link PydmlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDataTypeCheck(PydmlParser.MatrixDataTypeCheckContext ctx);
}