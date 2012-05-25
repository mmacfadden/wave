// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L25, C44
import com.google.gxp.html.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L25, C44
import com.google.gxp.js.*;                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L25, C44
import com.google.gxp.text.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L25, C44

public class TopBar extends com.google.gxp.base.GxpTemplate {                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L25, C44

  private static final String GXP$MESSAGE_SOURCE = "org.waveprotocol.box.server.gxp";

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String username, final String domain)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<div class=\"topbar\"><a href=\"/\"><img src=\"/static/logo.png\" alt=\"logo\" class=\"logo\"");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L30, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L31, C17
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L31, C17
    }
    gxp$out.append("></a>\n<div class=\"title\">Wave in a box</div>\n<div class=\"banner\" id=\"banner\"></div>\n<div class=\"info\">");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L31, C17
    if (username == null) {                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L35, C7
      gxp$out.append("Not logged in |\n<a href=\"/auth/register\">Register</a> |\n<a href=\"/auth/signin?r=/\">Sign In</a>");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L35, C39
    }
    gxp$out.append("\n");                                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L39, C16
    if (username != null) {                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L40, C7
      com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (username));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L41, C9
      gxp$out.append("<span class=\"domain\">@");                               // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L41, C37
      com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L41, C59
      gxp$out.append("</span> |\n<span id=\"unsavedStateContainer\" style=\"width: 60px\">Saved</span> |\n<span id=\"netstatus\" class=\"offline\">Offline</span> |\n<a href=\"/auth/signout?r=/\">Sign out</a>");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L41, C37
    }
    gxp$out.append("</div></div>");                                             // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/TopBar.gxp: L34, C5
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("username", "domain"));

  /**
   * @return the names of the user defined arguments to this template.
   * This is sort of like a mapping between the positional and named
   * parameters. The first two parameters (common to all templates) are
   * not included in this list. (BTW: No, Java reflection does not
   * provide this information)
   */
  public static java.util.List<String> getArgList() {
    return GXP$ARGLIST;
  }

  private abstract static class TunnelingHtmlClosure
      extends GxpTemplate.TunnelingGxpClosure
      implements com.google.gxp.html.HtmlClosure {
  }

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String username, final String domain) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.TopBar.write(gxp$out, gxp_context, username, domain);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String username, final String domain)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String username, final String domain);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String username, final String domain)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.TopBar.write(gxp$out, gxp_context, username, domain);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String username, final String domain) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, username, domain);
        }
      };
    }
  }
}

// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================