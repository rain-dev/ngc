import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

public class NGC2CPPWalker {
	public static final NGC2CPPWalker DEFAULT = new NGC2CPPWalker();

	private boolean inspectChild = true;
	
	public void walk(ParseTreeListener listener, ParseTree t) {
		if ( t instanceof ErrorNode) {
			listener.visitErrorNode((ErrorNode)t);
			return;
		}
		else if ( t instanceof TerminalNode) {
			listener.visitTerminal((TerminalNode)t);
			return;
		}
		RuleNode r = (RuleNode)t;
        enterRule(listener, r);
        if(isInspectChild())
        {
        	walkChild(listener, r);
        }
		exitRule(listener, r);
    }
	
	public void walkChild(ParseTreeListener listener, RuleNode t) {
		RuleNode r = (RuleNode)t;
        int n = r.getChildCount();
        for (int i = 0; i<n; i++) {
            walk(listener, r.getChild(i));
        }
    }

	/**
	 * The discovery of a rule node, involves sending two events: the generic
	 * {@link ParseTreeListener#enterEveryRule} and a
	 * {@link RuleContext}-specific event. First we trigger the generic and then
	 * the rule specific. We to them in reverse order upon finishing the node.
	 */
    protected void enterRule(ParseTreeListener listener, RuleNode r) {
		ParserRuleContext ctx = (ParserRuleContext)r.getRuleContext();
		listener.enterEveryRule(ctx);
		ctx.enterRule(listener);
    }

    protected void exitRule(ParseTreeListener listener, RuleNode r) {
		ParserRuleContext ctx = (ParserRuleContext)r.getRuleContext();
		ctx.exitRule(listener);
		listener.exitEveryRule(ctx);
    }

	public boolean isInspectChild() {
		return inspectChild;
	}

	public void setInspectChild(boolean inspectChild) {
		this.inspectChild = inspectChild;
	}
}
