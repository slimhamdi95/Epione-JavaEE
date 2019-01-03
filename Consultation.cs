using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Epione.Domain.Entities
{
    public class Consultation
    {
        public int Id { get; set; }
        public string Desease { get; set; }
        public string Treatment { get; set; }
        public DateTime Date { get; set; }
        public string DocFK { get; set; }
        [ForeignKey("DocFK")]
        public virtual Doctor Doctor { get; set; }

        public string PatFK { get; set; }
        [ForeignKey("PatFK")]
        public virtual Patient patient { get; set; }
    }
}
