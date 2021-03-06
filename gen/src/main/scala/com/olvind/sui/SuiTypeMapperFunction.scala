package com.olvind
package sui

object SuiTypeMapperFunction {
  val Callback = "Callback"

  def apply(compName: CompName, name: PropName): String =
    (compName.value, name.value) match {
      case (_, "onClick") => "ReactMouseEventFromInput => Callback"
      case (_, "onMouseDown") => "ReactMouseEventFromInput => Callback"
      case (_, "onMouseUp") => "ReactMouseEventFromInput => Callback"
      case (_, "onChange") => "ReactEventFromInput => Callback"
      case (_, "control") => Callback
      case (_, "onAddItem") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onBlur") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onClose") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onFocus") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onLabelClick") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onOpen") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onSearchChange") => "ReactEvent => Callback" //TODO more specific?
      case (_, "onActionClick") => "ReactEvent => Callback" //TODO more specific?
      case ("Dropdown", "renderLabel") => "(js.Object, Int, js.Object) => Callback" //TODO more specific?
      case ("Dropdown", "search") => "String | ReactEvent => Callback" //TODO more specific?
      case ("Modal", "onMount") => "ReactEvent => Callback" //TODO more specific?
      case ("Modal", "onUnmount") => "ReactEvent => Callback" //TODO more specific?
      case ("Rating", "onRate") => "(ReactEvent, SuiRateObject) => Callback" //TODO more specific?
      case ("Rating", "clearable") => "Int | String | ReactEvent => Callback" //TODO more specific?
      case ("Form", "onSubmit") => Callback //TODO more specific?
      case ("TextArea", "onInput") => Callback //TODO more specific?
      case ("Popup", "onMount") => Callback
      case ("Popup", "onUnmount") => Callback
      case _ =>
        throw new Error(
          s"""case ("${compName.value}", "${name.value}") => Callback  //TODO: Add function type mapping in ${getClass().getName}""")
    }
}
