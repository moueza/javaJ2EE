<html><body>
<ul>
{
for $x in doc("catalog.xml")/catalog/cd/title
order by $x
return <li>{data($x)}</li>
}
</ul>
</body></html>