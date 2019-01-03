using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Epione.Domain.Entities
{
    public class Doctor : User
    {

        public string Specialty { get; set; }
        [Range(0, int.MaxValue, ErrorMessage = "tu a deppaser la quantité voulu")]
        public float ConsultingFees { get; set; }
        public virtual ICollection<Availability> Availabilities { get; set; }
        public virtual ICollection<Appointment> Appointments { get; set; }
        public virtual ICollection<Consultation> Consultations { get; set; }
        public validation validation { get; set; }

    }
    public enum validation
    {
        ComptesPasValidés,
        ComptesValidés
    }
}

