// Configuración de Supabase - Reemplaza con tus credenciales
const SUPABASE_URL = localStorage.getItem('SUPABASE_URL') || 'https://tu-proyecto.supabase.co';
const SUPABASE_KEY = localStorage.getItem('SUPABASE_KEY') || 'tu-key-publico-aqui';

// Clase para manejar Supabase
class SupabaseManager {
    constructor() {
        this.url = SUPABASE_URL;
        this.key = SUPABASE_KEY;
        this.enabled = this.url !== 'https://tu-proyecto.supabase.co';
    }

    async request(table, method = 'GET', data = null) {
        if (!this.enabled) return null;

        const options = {
            method,
            headers: {
                'Content-Type': 'application/json',
                'Authorization': `Bearer ${this.key}`,
                'apikey': this.key
            }
        };

        if (data) options.body = JSON.stringify(data);

        try {
            const response = await fetch(`${this.url}/rest/v1/${table}`, options);
            return await response.json();
        } catch (error) {
            console.log('Supabase no disponible, usando localStorage');
            return null;
        }
    }

    async saveOrder(order) {
        if (this.enabled) {
            return await this.request('orders', 'POST', order);
        }
    }

    async saveUser(user) {
        if (this.enabled) {
            return await this.request('users', 'POST', user);
        }
    }

    async saveRating(rating) {
        if (this.enabled) {
            return await this.request('ratings', 'POST', rating);
        }
    }

    async loadOrders(userId) {
        if (this.enabled) {
            return await this.request(`orders?user_id=eq.${userId}`);
        }
        return null;
    }
}

const supabase = new SupabaseManager();

// Función para configurar Supabase
function configureSupabase() {
    const url = prompt('Ingresa tu SUPABASE_URL:', SUPABASE_URL);
    const key = prompt('Ingresa tu SUPABASE_KEY:', SUPABASE_KEY);

    if (url && key) {
        localStorage.setItem('SUPABASE_URL', url);
        localStorage.setItem('SUPABASE_KEY', key);
        alert('✓ Supabase configurado correctamente');
        location.reload();
    }
}

// Mostrar si Supabase está conectado
console.log(`Supabase: ${supabase.enabled ? '✓ Conectado' : '✗ Desconectado (usando localStorage)'}`);
