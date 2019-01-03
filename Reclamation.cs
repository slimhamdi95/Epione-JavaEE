using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Epione.Domain.Entities
{
    public class Reclamation
    {
        public int Id { get; set; }
        public string Desc { get; set; }

        public Doctor DocSrc { get; set; }
        public Doctor DocDest { get; set; }
        public Patient Pat { get; set; }
    }
}
