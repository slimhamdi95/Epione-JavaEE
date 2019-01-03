using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Epione.Domain.Entities
{
   public class Patient:User
    {
        public int SocialSecurityNumber { get; set; }
        public string profession { get; set; }
        public float weight { get; set; }
        public float height { get; set; }
        public string allergies { get; set; }
        public string treatments { get; set; }
        public string antecedents { get; set; }
        public string comments { get; set; }


        public virtual ICollection<Appointment> Appointments { get; set; }

        public virtual ICollection<Consultation> Consultations { get; set; }
    }
}
