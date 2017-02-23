for $x in doc("catalog.xml")/catalog/cd
where $x/price>10
order by $x/title
return $x/title