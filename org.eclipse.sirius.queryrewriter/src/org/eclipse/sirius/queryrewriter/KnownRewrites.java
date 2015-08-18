package org.eclipse.sirius.queryrewriter;

import java.util.Map;

import com.google.common.collect.Maps;

public class KnownRewrites {

	public static Map<String, String> conversion = Maps.newHashMap();

	static {
		mtltoAQLConversions(conversion);
		a2toAQLConversions(conversion);
	}

	public static void mtltoAQLConversions(Map<String, String> conversion) {
		conversion.put("['send_' + message.name/]", "aql:'send_' + self.message.name"); // 14
																						// occurrences
		conversion.put("['receive_' + message.name/]", "aql:'receive_' + self.message.name"); // 12
																								// occurrences
		conversion.put("[source.eContainer(interactions::Interaction)/]",
				"aql:source.eContainer(interactions::Interaction)"); // 9
		// occurrences
		conversion.put("['start_' + execution.name/]", "aql:'start_' + self.execution.name"); // 5
																								// occurrences
		conversion.put("[newMessage.sendingEnd/]", "aql:newMessage.sendingEnd"); // 2
																					// occurrences
		conversion.put("[not coveredParticipants->isEmpty()/]", "aql:not self.coveredParticipants->isEmpty()"); // 2
																												// occurrences
		conversion.put("['finish_' +  execution.name/]", "aql:'finish_' + self.execution.name"); // 1
																									// occurrences
		conversion.put("[name + ' : ' + (if type.oclIsUndefined() then '' else type.name endif)/]",
				"aql:self.name + ' : ' + self.type.name"); // 1
															// occurrences
		conversion.put("[start = end/]", "aql:self.start = self.end"); // 1
																		// occurrences
		conversion.put("['Sequence Diagram on ' + name/]", "aql:'Sequence Diagram on ' + self.name"); // 1
																										// occurrences
		conversion.put("[eContents()->size()/]", "aql:self.eContents()->size()"); // 1
																					// occurrences
		conversion.put("['newParticipant' + eContainer(interactions::Interaction).participants->size()/]",
				"aql:'newParticipant' + self.eContainer(interactions::Interaction).participants->size()"); // 1
																											// occurrences
		conversion.put("['[' +  name  + ']'/]", "aql:'[' + self.name + ']'"); // 1
																				// occurrences
		conversion.put("['m_create' + eContainer(interactions::Interaction).messages->size()/]",
				"aql:'m_create' + self.eContainer(interactions::Interaction).messages->size()"); // 1
																									// occurrences
		conversion.put("['call(' + interaction.name + ')'/]", "'call(' + self.interaction.name + ')'"); // 1
																										// occurrences
		conversion.put("[self.oclAsSet()->union(self.interaction.oclAsSet())/]",
				"self->asSet()->union(self.interaction->asSet())"); // 1
																	// occurrences
	}

	public static void a2toAQLConversions(Map<String, String> conversion) {
		conversion.put("<%false%>", "aql:false");
		conversion.put("<%true%>", "aql:true");
		conversion.put("<%$newState.owner%>", "aql:newState.owner");

		conversion.put("<%$newExecution.owner%>", "aql:newExecution.owner"); // 2
																				// occurrences

		conversion.put("<%ends%>", "aql:self.ends"); // 1 occurrences
		conversion.put("<%expression%>", "aql:self.expression"); // 1
																	// occurrences
		conversion.put("<%$end.message%>", "aql:end.message"); // 1 occurrences
		conversion.put("<%current%>", "aql:self"); // 1 occurrences
		conversion.put("<%$end.execution%>", "aql:end.execution"); // 1
																	// occurrences

		conversion.put("start_<%$instance.name%>", "aql:'start_' + instance.name"); // 1
																					// occurrences
		conversion.put("start_<%state.name%>", "aql:'start_' + self.state.name"); // 1
																					// occurrences
		conversion.put("finish_<%state.name%>", "aql:'finish_' + self.state.name"); // 1
																					// occurrences
		conversion.put("finish_<%execution.name%>", "aql:'finish' + self.execution.name");
		conversion.put("<%constraints%>", "aql:self.constraints"); // 1
																	// occurrences
		conversion.put("<%$end.state%>", "aql:end.state"); // 1 occurrences
		conversion.put("<%$sendingEnd.context%>", "aql:sendingEnd.context"); // 1
																				// occurrences
		conversion.put("<%$element.deleteOperand()%>", "aql:element.deleteOperand()"); // 1
																						// occurrences

		conversion.put("<%eContainer(\"Interaction\")%>", "aql:self.eContainerOrSelf(interactions::Interaction)");
		conversion.put("<%$element.eContainer(\"Interaction\")%>",
				"aql:element.eContainerOrSelf(interactions::Interaction)");
		conversion.put("m<%eContainer(\"Interaction\").messages.nSize %>",
				"aql:'m' + self.eContainerOrSelf(interactions::Interaction).messages->size()");

		// non validated by gerrit

		// validated by SequenceBasicMessage
		conversion.put("start_<%$newOperand.name%>", "aql:'start_' + newOperand.name"); // 2
																						// occurrences
		conversion.put("<%$newOperand.eContainer%>", "aql:newOperand.eContainer()"); // 1
																						// occurrences
		// need boolean coercion
		conversion.put("<%self.sendingEnd%>", "aql:self.sendingEnd"); // 2
																		// occurrences
		conversion.put("<%self.receivingEnd%>", "aql:self.receivingEnd"); // 2
		// validated by nothing

		conversion.put("e<%eContainer(\"Interaction\").executions.nSize%>",
				"aql:'e' + self.eContainerOrSelf(interactions::Interaction).executions->size()");
		conversion.put("<%$element.currentParticipant.type.eStructuralFeatures.nFirst%>",
				"aql:element.currentParticipant().type.eStructuralFeatures->first()");
		conversion.put("<%eContainer(\"interactions.Interaction\")%>",
				"aql:self.eContainerOrSelf(interactions::Interaction)");
		conversion.put("<%$target.currentParticipant.type.eStructuralFeatures.nFirst%>",
				"aql:target.currentParticipant().type.eStructuralFeatures->first()");
		conversion.put("m_destroy<%eContainer(\"Interaction\").messages.nSize %>",
				"aql:'m_destroy'+ self.eContainerOrSelf(interactions::Interaction).messages->size()");
		conversion.put("<%$target.currentParticipant.type.eOperations.nFirst%>",
				"aql:target.currentParticipant().type.eOperations->first()");
		conversion.put("<%$element.currentParticipant.type.eOperations.nFirst%>",
				"aql:element.currentParticipant().type.eOperations->first()");
		conversion.put("m_return<%eContainer(\"Interaction\").messages.nSize %>",
				"aql:'m_return' + self.eContainerOrSelf(interactions::Interaction).messages->size()"); // 3
																										// occurrences
		conversion.put("<%$container.eContainer(\"Interaction\")%>",
				"aql:container.eContainerOrSelf(interactions::Interaction)"); // 2
																				// occurrences
		conversion.put("<%$container.currentParticipant.type.eOperations.nFirst%>",
				"aql:container.currentParticipant().type.eOperation->first()"); // 2
																				// occurrences

		/*
		 * if value exists
		 */
		conversion.put("<%if ($startingEndPredecessor){%><%$startingEndPredecessor.semanticEnd%><%}%>",
				"aql:startingEndPredecessor.semanticEnd");
		conversion.put("<%if ($endBefore){%><%$endBefore.semanticEnd%><%}%>", "aql:endBefore.semanticEnd");
		conversion.put("<%if ($finishingEndPredecessor){%><%$finishingEndPredecessor.semanticEnd%><%}%>",
				"aql:finishingEndPredecessor.semanticEnd");
		conversion.put("<%if ($startingEndPredecessorAfter){%><%$startingEndPredecessorAfter.semanticEnd%><%}%>",
				"aql:startingEndPredecessorAfter.semanticEnd");
		conversion.put("<%if ($finishingEndPredecessorAfter){%><%$finishingEndPredecessorAfter.semanticEnd%><%}%>",
				"aql:finishingEndPredecessorAfter.semanticEnd");
		conversion.put("<%if ($predecessorAfter){%><%$predecessorAfter%><%}%>", "aql:predecessorAfter"); // 1
																											// occurrences
		conversion.put("<%if ($predecessor){%><%$predecessor%><%}%>", "aql:predecessor"); // 1
																							// occurrences
																							// Check
																							// SequenceBasicMessageTest,
																							// MesssageExtensionTest,
																							// SequenceExecutionBasicAndReturnMessageTest...

		/*
		
		
		
		 */
		// //9 occurrences
		conversion.put("m_create<%eContainer(\"Interaction\").messages.nSize %>",
				"aql:'m_create' + self.eContainerOrSelf(interactions::Interaction).messages->size()"); // 2
																										// occurrences
		conversion.put("<%$source.sendingEnd%>", "aql:source.sendingEnd"); // 1
																			// occurrences
		conversion.put("<%$source.receivingEnd%>", "aql:source.receivingEnd"); // 1
																				// occurrences
		conversion.put("ps<%eContainer(\"Interaction\").states.nSize%>",
				"aql:'ps' + self.eContainerOrSelf(interactions::Interaction).states->size()"); // 1
																								// occurrences
		conversion.put("<%$container.eContainer(\"CombinedFragment\")%>",
				"aql:container.eContainerOrSelf(interactions::CombinedFragment)"); // 1
																					// occurrences
		conversion.put("s<%eContainer(\"Interaction\").states.nSize%>",
				"aql:'s' + self.eContainerOrSelf(interactions::Interaction).states->size()"); // 1
																								// occurrences
		conversion.put("start_<%$newCF.operator%>", "aql:'start_'+ newCF.operator"); // 1
																						// occurrences
		conversion.put("<%$target.sendingEnd%>", "aql:target.sendingEnd"); // 1
																			// occurrences
		conversion.put("finish_<%$newCF.operator%>", "aql:'finish_' + newCF.operator"); // 1
																						// occurrences
		conversion.put("middle_<%state.name%>", "aql:'middle_' + self.state.name"); // 1
																					// occurrences

		conversion.put("finish_<%$instance.name%>", "aql:'finish_' + instance.name"); // 1
																						// occurrences
		conversion.put("<%eContainer(\"CombinedFragment\")%>",
				"aql:self.eContainerOrSelf(interactions::CombinedFragment)"); // 1
																				// occurrences
		conversion.put("condition.<%eContainer.ownedOperands.nSize%>",
				"aql:'condition.' + self.eContainer().ownedOperands->size()"); // 1
																				// occurrences
		conversion.put("alt.<%eContainer.eContents.filter(\"CombinedFragment\").nSize%>",
				"aql:'alt.' + self.eContainer().eContents()->filter(interactions::CombinedFragment)->size()"); // 1
																												// occurrences

		conversion.put("<%constrainedEnds.nGet(0)%>", "aql:self.constrainedEnds->at(1)"); // 1
																							// occurrences
		conversion.put("<%constrainedEnds.nGet(1)%>", "aql:self.constrainedEnds->at(2)"); // 1
																							// occurrences

		conversion.put("<%start != end%>", "aql:self.start <> self.end"); // 1
																			// occurrences
		conversion.put("<%constrainedEnds.nSize == 2%>", "aql:self.constrainedEnds->size() = 2"); // 1
																									// occurrences
		conversion.put("<%$target.receivingEnd%>", "aql:target.receivingEnd"); // 1
																				// occurrences

		conversion.put("<%self.filter(\"Message\")%>", "aql:self.oclIsKindOf(interactions::Message)"); // 1
																										// occurrences
		conversion.put("<%self.filter(\"Operand\")%>", "aql:self.oclIsKindOf(interactions::Operand)"); // 1
																										// occurrences
		conversion.put("<%self.filter(\"Participant\")%>", "aql:self.oclIsKindOf(interactions::Participant)"); // 1
																												// occurrences
		conversion.put("<%self.filter(\"CombinedFragment\")%>", "aql:self.oclIsKindOf(interactions::CombinedFragment)"); // 1
																															// occurrences
		conversion.put("<%self.filter(\"State\")%>", "aql:self.oclIsKindOf(interactions::State)"); // 1
																									// occurrences
		conversion.put("<%self.filter(\"Execution\")%>", "aql:self.oclIsKindOf(interactions::Execution)"); // 1
																											// occurrences
		conversion.put("<%self.filter(\"InteractionUse\")%>", "aql:self.oclIsKindOf(interactions::InteractionUse)"); // 1
																														// occurrences

		conversion.put("ref.<%eContainer.eContents.filter(\"InteractionUse\").nSize%>",
				"aql:'ref.' + self.eContainer().eContents()->filter(interactions::InteractionUse)->size()"); // 1
																												// occurrences

		conversion.put("<%$element.deleteCombinedFragment()%>", "aql:element.deleteCombinedFragment()"); // 1
																											// occurrences

		// occurrences
		conversion.put("<%$preSource != $preTarget && $preTarget.isValidTargetForConstraintCreation()%>",
				"aql:preSource <> preTarget and preTarget.isValidTargetForConstraintCreation()"); // 1
																									// occurrences

		conversion.put("<%$preSource.isValidSourceForConstraintCreation()%>",
				"aql:preSource.isValidSourceForConstraintCreation()"); // 1
																		// occurrences

		/*
		 * ************Not tested yet*************
		 */

		conversion.put("constraint<%eContainer.eContents.filter(\"Constraint\").nSize%>",
				"aql:'constraint' + self.eContainer().eContents()->filter(interactions::Constraint)->size()"); // 1
																												// occurrences
		/*
		 * test for emptyness/nullness
		 */
		conversion.put("<%filter(\"MixEnd\").nSize == 0 ||filter(\"MixEnd\").nSize != 0 && current.message == null%>",
				"aql:not self.oclIsKindOf(interactions::MixEnd) or (self.oclIsKindOf(interactions::MixEnd) and self.message = null)"); // 2
																																		// occurrences
		conversion.put("<%filter(\"MixEnd\").nSize == 0 ||filter(\"MixEnd\").nSize != 0 && current.execution == null%>",
				"aql:not self.oclIsKindOf(interactions::MixEnd) or (self.oclIsKindOf(interactions::MixEnd) and self.execution = null)"); // 2

		conversion.put("<%!current.sendingEnd  && current.receivingEnd == $end%>",
				"aql:self.sendingEnd = null and self.receivingEnd = end"); // 1
																			// //
																			// occurrences
		conversion.put("<%current.sendingEnd == $end && !current.receivingEnd%>",
				"aql:self.sendingEnd = end and self.receivingEnd = null"); // 1

		// occurrences

		/*
		 * eInverse
		 */
		conversion.put("<%$element.~context[eContainer != null]%>",
				"aql:self.eInverse('context')->select( c | c.eContainer()->size() > 0)"); // 1
																							// occurrences

		conversion.put(
				"<%$source.filter(\"CallMessage\") && $source.filter(\"CallMessage\").receivingEnd.filter(\"MixEnd\")%>",
				"aql:source.oclIsKindOf(interactions::CallMessage) and source.receivingEnd.oclIsKindOf(interactions::MixEnd)"); // 1
																																// occurrences
		conversion.put(
				"<%$target.filter(\"ReturnMessage\") && $target.filter(\"ReturnMessage\").sendingEnd.filter(\"MixEnd\")%>",
				"aql:target.oclIsKindOf(interactions::ReturnMessage) and target.sendingEnd.oclIsKindOf(interactions::MixEnd)"); // 1
																																// occurrences
		conversion.put(
				"<%$source.filter(\"ReturnMessage\") && $source.filter(\"ReturnMessage\").sendingEnd.filter(\"MixEnd\")%>",
				"aql:source.oclIsKindOf(interactions::ReturnMessage) and source.sendingEnd.oclIsKindOf(interactions::MixEnd)"); // 1
																																// occurrences
		conversion.put(
				"<%$target.filter(\"CallMessage\") && $target.filter(\"CallMessage\").receivingEnd.filter(\"MixEnd\")%>",
				"aql:target.oclIsKindOf(interactions::CallMessage) and target.receivingEnd.oclIsKindOf(interactions::MixEnd)"); // 1
																																// occurrences

		/*
		 * Not migrated, refers to DNode types
		 */
		conversion.put(
				"<%$container.filter(\"interactions.Participant\")[$containerView.eContainer.filter(\"DNode\")]  + $container.filter(\"interactions.Execution\")%>",
				"aql:(container.oclIsKindOf(interactions::Participant) and containerView.eContainer().oclIsKindOf(diagram::DNode)) or container.oclIsKindOf(interactions::Execution)"); // 2
		// occurrences
		conversion.put(
				"<%$element.filter(\"interactions.Participant\") && $elementView.eContainer.filter(\"DNode\") && $elementView.eContainer.eContainer.filter(\"DDiagram\") && $element.canCreate($endBefore)%>",
				"aql:element.oclIsKindOf(interactions::Participant) and elementview.eContainer().oclIsKindOf(diagram::DNode) and elementView.eContainer().eContainer().oclIsKindOf(diagram::DDiagram) and element.canCreate(endBefore)"); // 1
																																																											// occurrences
		conversion.put(
				"<%$element.filter(\"interactions.Participant\") && $elementView.eContainer.filter(\"DNode\") && $elementView.eContainer.eContainer.filter(\"DDiagram\") && $element.canDestroy($endBefore)%>",
				"aql:element.oclIsKindOf(interactions::Participant) and elementView.eContainer().oclIsKindOf(diagram::DNode) and elementView.eContaienr().eContainer().oclIsKindOf(diagram::DDiagram) and element.canDestroy(endBefore)"); // 1

		conversion.put(
				"<%$element.filter(\"interactions.Participant\")[$elementView.eContainer.filter(\"DNode\")]  + $element.filter(\"interactions.Execution\")%>",
				"aql:(element.oclIsKindOf(interactions::Participant) and elementView.eContaienr().oclIsKindOf(diagram::DNode)) or element.oclIsKindOf(interactions::Execution)");

		// occurrences

		/*
		 * preceding sibling don't seem to work
		 */
		// BUG HERE ! See CombinedFragmentsTests and
		// CombinedFragmentsOperandOverlapTests

		conversion.put(
				"<%(($newOperand.start.precedingSibling.nReverse.filter(\"OperandEnd\") && $newOperand.eContainer.ownedOperands.start).nFirst).owner%>",
				"aql:newOperand.start.precedingSiblings()->reverse()->filter(interactions::OperandEnd)->asSet()->intersection(newOperand.eContainer().ownedOperands.start->asSet())->first().owner"); // 1
		// occurrences
		conversion.put(
				"<%self.sendingEnd.precedingSibling.filter(\"interactions.MessageEnd\")[current.message.receivingEnd == current].nLast.message%>",
				"" + "aql:self.sendingEnd.precedingSiblings()->filter(interactions::MessageEnd)->select(current | current.message.receivingEnd = current)->last().message"); // 1
		// occurrences
		conversion.put(
				"<%self.start.precedingSibling.filter(\"interactions.StateEnd\")[current.state.start == current].nLast.state%>",
				"aql:self.start.precedingSiblings()->filter(interactions::StateEnd)->select(current | current.state.start = current)->last().state"); // 1
		// occurrences
		conversion.put(
				"<%self.start.precedingSibling.filter(\"interactions.InteractionUseEnd\")[current.owner.start == current].nLast.owner%>",
				"aql:self.start.precedingSiblings()->filter(interactions::InteractionUseEnd)->select(current| current.owner.start = current)->last().owner"); // 1
		// occurrences
		conversion.put(
				"<%self.start.precedingSibling.filter(\"interactions.ExecutionEnd\")[current.execution.start == current].nLast.execution%>",
				"aql:self.start.precedingSiblings()->filter(interactions::ExecutionEnd)->select(current | current.execution.start = current)->last().execution"); // 1
		// occurrences
		conversion.put(
				"<%self.start.precedingSibling.filter(\"interactions.CombinedFragmentEnd\")[current.owner.start == current].nLast.owner%>",
				"aql:self.start.precedingSiblings()->filter(interactions::CombinedFragmentEnd)->select(current | current.owner.start = current)->last().owner"); // 1
		conversion.put(
				"<%self.start.precedingSibling.filter(\"interactions.OperandEnd\")[current.owner.start == current && current(1).eContainer(\"interactions.CombinedFragment\") == current().owner.eContainer(\"interactions.CombinedFragment\")].nLast.owner%>",
				"aql:self.start.precedingSiblings()->filter(interactions::OperandEnd)->select(op | op.owner.start = op and self.eContainerOrSelf(interactions::CombinedFragment) = op.owner.eContainerOrSelf(interactions::CombinedFragment))->last().owner)"); // 1
																																																																// occurrences

		// occurrences
	}
}
