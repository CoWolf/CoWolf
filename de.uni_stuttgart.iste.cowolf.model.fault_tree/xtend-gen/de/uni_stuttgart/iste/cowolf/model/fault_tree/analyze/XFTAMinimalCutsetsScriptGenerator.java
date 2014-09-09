package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.XFTAGenerator;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XFTAMinimalCutsetsScriptGenerator implements XFTAGenerator {
  public CharSequence doGenerateXFTAFile(final FaultTree root, final Map<String, Object> parameters) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xFTAMinimalCutsetsScriptTemplate = this.xFTAMinimalCutsetsScriptTemplate(root, parameters);
    _builder.append(_xFTAMinimalCutsetsScriptTemplate, "");
    return _builder;
  }
  
  public CharSequence xFTAMinimalCutsetsScriptTemplate(final FaultTree r, final Map<String, Object> parameters) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE xfta>");
    _builder.newLine();
    _builder.append("<xfta>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<load>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<model input=\"");
    Object _get = parameters.get("pathToInputXFTAFile");
    _builder.append(_get, "    ");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</load>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<minimal-cutsets top-event=\"");
    Hazard _hazard = r.getHazard();
    String _id = _hazard.getId();
    _builder.append(_id, "    ");
    _builder.append("\" handle=\"MCS\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</build>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<set>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<option name=\"print-minimal-cutset-rank\" value=\"on\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<option name=\"print-minimal-cutset-order\" value=\"off\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<option name=\"print-minimal-cutset-probability\" value=\"on\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<option name=\"print-minimal-cutset-contribution\" value=\"on\" />");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</set>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<print>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<minimal-cutsets top-event=\"");
    Hazard _hazard_1 = r.getHazard();
    String _id_1 = _hazard_1.getId();
    _builder.append(_id_1, "    ");
    _builder.append("\" handle=\"MCS\" output=\"");
    Object _get_1 = parameters.get("pathToOutputXFTAFile");
    _builder.append(_get_1, "    ");
    _builder.append("\" mode=\"write\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</print>");
    _builder.newLine();
    _builder.append("</xfta>");
    _builder.newLine();
    return _builder;
  }
}
