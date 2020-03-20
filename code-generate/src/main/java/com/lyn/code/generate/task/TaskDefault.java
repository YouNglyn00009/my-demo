//调试表原始对象
{
  "title" : "调试：com.intellij.database.psi.DbTableImpl",
  "methodList" : [ {
    "name" : "isSystem",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
    "value" : "false"
  }, {
    "name" : "getColumnAttrs",
    "desc" : "public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
    "value" : null
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> lyn-db@localhost<br><b>Schema:</b> lyn-db<br><b>Table:</b> task<br><br><font color=\"#808080\">-- 任务表</font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\"><b>create</b></font> <font color=\"#cc7832\"><b>table</b></font> task\n(\n  id          <font color=\"#cc7832\"><b>bigint</b></font>                              <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;主键&#39;</font>\n    <font color=\"#cc7832\"><b>primary</b></font> <font color=\"#cc7832\"><b>key</b></font><font color=\"#cc7832\">,</font>\n  biz_no      <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;业务号&#39;</font><font color=\"#cc7832\">,</font>\n  biz_type    <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;业务类型&#39;</font><font color=\"#cc7832\">,</font>\n  stauts      <font color=\"#cc7832\"><b>int</b></font>                                 <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;状态&#39;</font><font color=\"#cc7832\">,</font>\n  create_time <font color=\"#cc7832\"><b>datetime</b></font>                            <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;创建时间&#39;</font><font color=\"#cc7832\">,</font>\n  update_time <font color=\"#cc7832\"><b>datetime</b></font>                            <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;修改时间&#39;</font><font color=\"#cc7832\">,</font>\n  create_user <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;创建人&#39;</font><font color=\"#cc7832\">,</font>\n  update_user <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;修改人&#39;</font><font color=\"#cc7832\">,</font>\n  ts          <font color=\"#cc7832\"><b>timestamp</b></font> <font color=\"#cc7832\"><b>default</b></font> <font color=\"#cc7832\"><b>CURRENT_TIMESTAMP</b></font> <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>on</b></font> <font color=\"#cc7832\"><b>update</b></font> <font color=\"#cc7832\"><b>CURRENT_TIMESTAMP</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;时间戳&#39;</font><font color=\"#cc7832\">,</font>\n  yn          <font color=\"#cc7832\"><b>tinyint</b></font>   <font color=\"#cc7832\"><b>default</b></font> <font color=\"#6897bb\">1</font>                 <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;删除标识&#39;</font>\n)\n  <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;任务表&#39;</font><font color=\"#cc7832\">;</font></pre></code>"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> lyn-db@localhost<br><b>Schema:</b> lyn-db<br><b>Table:</b> task<br><br><font color=\"#808080\">-- 任务表</font><br><code><pre><font color=\"#808080\">-- auto-generated definition</font>\n<font color=\"#cc7832\"><b>create</b></font> <font color=\"#cc7832\"><b>table</b></font> task\n(\n  id          <font color=\"#cc7832\"><b>bigint</b></font>                              <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;主键&#39;</font>\n    <font color=\"#cc7832\"><b>primary</b></font> <font color=\"#cc7832\"><b>key</b></font><font color=\"#cc7832\">,</font>\n  biz_no      <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;业务号&#39;</font><font color=\"#cc7832\">,</font>\n  biz_type    <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;业务类型&#39;</font><font color=\"#cc7832\">,</font>\n  stauts      <font color=\"#cc7832\"><b>int</b></font>                                 <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;状态&#39;</font><font color=\"#cc7832\">,</font>\n  create_time <font color=\"#cc7832\"><b>datetime</b></font>                            <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;创建时间&#39;</font><font color=\"#cc7832\">,</font>\n  update_time <font color=\"#cc7832\"><b>datetime</b></font>                            <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;修改时间&#39;</font><font color=\"#cc7832\">,</font>\n  create_user <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;创建人&#39;</font><font color=\"#cc7832\">,</font>\n  update_user <font color=\"#cc7832\"><b>varchar</b></font>(<font color=\"#6897bb\">30</font>)                         <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;修改人&#39;</font><font color=\"#cc7832\">,</font>\n  ts          <font color=\"#cc7832\"><b>timestamp</b></font> <font color=\"#cc7832\"><b>default</b></font> <font color=\"#cc7832\"><b>CURRENT_TIMESTAMP</b></font> <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>on</b></font> <font color=\"#cc7832\"><b>update</b></font> <font color=\"#cc7832\"><b>CURRENT_TIMESTAMP</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;时间戳&#39;</font><font color=\"#cc7832\">,</font>\n  yn          <font color=\"#cc7832\"><b>tinyint</b></font>   <font color=\"#cc7832\"><b>default</b></font> <font color=\"#6897bb\">1</font>                 <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;删除标识&#39;</font>\n)\n  <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;任务表&#39;</font><font color=\"#cc7832\">;</font></pre></code>"
  }, {
    "name" : "isTemporary",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
    "value" : "false"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "task"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "lyn-db [lyn-db@localhost]"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "jar:file:/Applications/IntelliJ%20IDEA%202.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg"
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "table"
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "create table task\n(\n  id          bigint                              not null comment '主键'\n    primary key,\n  biz_no      varchar(30)                         not null comment '业务号',\n  biz_type    varchar(30)                         not null comment '业务类型',\n  stauts      int                                 not null comment '状态',\n  create_time datetime                            null comment '创建时间',\n  update_time datetime                            null comment '修改时间',\n  create_user varchar(30)                         null comment '创建人',\n  update_user varchar(30)                         null comment '修改人',\n  ts          timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '时间戳',\n  yn          tinyint   default 1                 not null comment '删除标识'\n)\n  comment '任务表';\n\n"
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: table, lyn-db.task [lyn-db@localhost] (Valid)"
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "table:task"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:lyn-db@localhost"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:lyn-db@localhost"
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project '/Users/yanglin/work/code/my-demo' my-demo"
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "task: table"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@59c26e7e"
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA%202.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbElementImpl.getWeight()",
    "value" : "10000"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "0"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "table:task"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "com.intellij.psi.impl.PsiManagerImpl@1a82f190"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "任务表"
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "task"
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "table:task"
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@65a51dac"
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "table:task"
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "table:task"
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "overlayIcons",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "createLayeredIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "registerIconLayer",
    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@a119c48, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@59ec4c92, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA%202.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}}"
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "schema:lyn-db"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@22ec6b24"
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@22ec6b24"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@7ae3ac50"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "schema:lyn-db"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "task: table"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "19"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@5ffa05be"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@552a2470"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "com.intellij.util.NullableFunction",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$968/1445575769@54163e35"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$1@33f099cb"
  }, {
    "name" : "ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$2@3c28bdfe"
  }, {
    "name" : "ourIconLayers",
    "type" : "java.util.List",
    "value" : "[com.intellij.psi.impl.ElementBase$IconLayer@38a517af, com.intellij.psi.impl.ElementBase$IconLayer@5da77118, com.intellij.psi.impl.ElementBase$IconLayer@6a2e85a6, com.intellij.psi.impl.ElementBase$IconLayer@13901250]"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "myUserMap",
    "type" : "com.intellij.util.keyFMap.KeyFMap",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@a119c48, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@59ec4c92, lastComputedIcon={0=Row icon. myIcons=[jar:file:/Applications/IntelliJ%20IDEA%202.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.svg, null]}}"
  }, {
    "name" : "updater",
    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@31877e2"
  } ]
}

//调试列原始对象
{
  "title" : "调试：com.intellij.database.psi.DbColumnImpl",
  "methodList" : [ {
    "name" : "getDefault",
    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
    "value" : null
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:task"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:task"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:task"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "table:task"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "table:task"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "table:task"
  }, {
    "name" : "getTableName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getTableName()",
    "value" : "task"
  }, {
    "name" : "isNotNull",
    "desc" : "public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
    "value" : "true"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> lyn-db@localhost<br><b>Schema:</b> lyn-db<br><b>Table:</b> task<br><b>Column:</b> id<br><br><font color=\"#808080\">-- 主键</font><br><code><pre><font color=\"#cc7832\"><b>alter</b></font> <font color=\"#cc7832\"><b>table</b></font> task\n  <font color=\"#cc7832\"><b>add</b></font> id <font color=\"#cc7832\"><b>bigint</b></font> <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;主键&#39;</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation()",
    "value" : "<html><body><b>Data Source:</b> lyn-db@localhost<br><b>Schema:</b> lyn-db<br><b>Table:</b> task<br><b>Column:</b> id<br><br><font color=\"#808080\">-- 主键</font><br><code><pre><font color=\"#cc7832\"><b>alter</b></font> <font color=\"#cc7832\"><b>table</b></font> task\n  <font color=\"#cc7832\"><b>add</b></font> id <font color=\"#cc7832\"><b>bigint</b></font> <font color=\"#cc7832\"><b>not</b></font> <font color=\"#cc7832\"><b>null</b></font> <font color=\"#cc7832\"><b>comment</b></font> <font color=\"#6a8759\">&#39;主键&#39;</font><font color=\"#cc7832\">;</font>\n\n</pre></code>"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbColumnImpl.getWeight()",
    "value" : "10030"
  }, {
    "name" : "getDataType",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
    "value" : "bigint(20)"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "id"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "column"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "lyn-db.task [lyn-db@localhost]"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "jar:file:/Applications/IntelliJ%20IDEA%202.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "column"
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "alter table task\n  add id bigint not null comment '主键';\n\n"
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "table:task"
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "table:task"
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: column, lyn-db.task.id [lyn-db@localhost] (Valid)"
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "column:id"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:lyn-db@localhost"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "root:lyn-db@localhost"
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project '/Users/yanglin/work/code/my-demo' my-demo"
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "id: column"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@59c26e7e"
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=jar:file:/Applications/IntelliJ%20IDEA%202.app/Contents/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.svg"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "1"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "column:id"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "com.intellij.psi.impl.PsiManagerImpl@1a82f190"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "主键"
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "id"
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "column:id"
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "table:task"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@65a51dac"
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "column:id"
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "column:id"
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "overlayIcons",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "createLayeredIcon",
    "desc" : "public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "registerIconLayer",
    "desc" : "public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@6db838e6, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5532b3d2}"
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "table:task"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@22ec6b24"
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@22ec6b24"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@7ae3ac50"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "table:task"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "id: column"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "19"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@5ffa05be"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@552a2470"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "com.intellij.util.NullableFunction",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$968/1445575769@54163e35"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$1@33f099cb"
  }, {
    "name" : "ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.psi.impl.ElementBase$2@3c28bdfe"
  }, {
    "name" : "ourIconLayers",
    "type" : "java.util.List",
    "value" : "[com.intellij.psi.impl.ElementBase$IconLayer@38a517af, com.intellij.psi.impl.ElementBase$IconLayer@5da77118, com.intellij.psi.impl.ElementBase$IconLayer@6a2e85a6, com.intellij.psi.impl.ElementBase$IconLayer@13901250]"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "myUserMap",
    "type" : "com.intellij.util.keyFMap.KeyFMap",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@6db838e6, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5532b3d2}"
  }, {
    "name" : "updater",
    "type" : "com.intellij.util.concurrency.AtomicFieldUpdater",
    "value" : "com.intellij.util.concurrency.AtomicFieldUpdater@31877e2"
  } ]
}

//调试列原始列类型
{
  "title" : "调试：com.intellij.database.model.DataType",
  "methodList" : [ {
    "name" : "getLength",
    "desc" : "public int com.intellij.database.model.DataType.getLength()",
    "value" : "20"
  }, {
    "name" : "equalsWithoutJdbc",
    "desc" : "public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
    "value" : null
  }, {
    "name" : "getScale",
    "desc" : "public int com.intellij.database.model.DataType.getScale()",
    "value" : "0"
  }, {
    "name" : "getPrecision",
    "desc" : "public int com.intellij.database.model.DataType.getPrecision()",
    "value" : "20"
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
    "value" : null
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification()",
    "value" : "bigint(20)"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "MAX_SIZE",
    "type" : "int",
    "value" : "2147483647"
  }, {
    "name" : "STAR_SIZE",
    "type" : "int",
    "value" : "2147483646"
  }, {
    "name" : "NO_SIZE",
    "type" : "int",
    "value" : "-1"
  }, {
    "name" : "NO_SCALE",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "UNKNOWN",
    "type" : "com.intellij.database.model.DataType",
    "value" : "unknown"
  }, {
    "name" : "schemaName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "packageName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "typeName",
    "type" : "java.lang.String",
    "value" : "bigint"
  }, {
    "name" : "size",
    "type" : "int",
    "value" : "20"
  }, {
    "name" : "scale",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "sizeUnit",
    "type" : "com.intellij.database.model.LengthUnit",
    "value" : "com.intellij.database.model.LengthUnit@840b04e"
  }, {
    "name" : "vagueArg",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "suffix",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "sizeUnitExplicit",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "custom",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "enumValues",
    "type" : "java.util.List",
    "value" : null
  }, {
    "name" : "jdbcType",
    "type" : "int",
    "value" : "0"
  } ]
}

//获取原始列类型中的字段
sqlType = bigint

//执行原始列类型中的方法
sqlTypeLen = 20