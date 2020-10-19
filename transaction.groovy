List ediList    = ["Select:selected", "201", "202", "203"]
List cdiList   = ["Select:selected", "801", "802", "803"]

List default_item = ["None"]

if (project.equals('edi')) {
  return ediList
} else if (Environment.equals('cdi')) {
  return cdiList
}  else {
  return default_item
}