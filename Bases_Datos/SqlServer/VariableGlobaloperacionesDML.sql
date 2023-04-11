DECLARE @emails NVARCHAR(MAX);
SET @emails = N'acruzc@fna.gov.co,era@stefanini.com,gmarins@fna.gov.co,japarra@fna.gov.co';


IF EXISTS(SELECT 1 FROM configuracion_general WHERE dominio='system' and codigo='notification-emails-pending-companies')
    BEGIN
        UPDATE configuracion_general
        SET valor=@emails
        WHERE dominio='system' and codigo='notification-emails-pending-companies';
        PRINT 'Updated system - notification-emails-pending-companies';
    END
ELSE
    BEGIN
        INSERT INTO configuracion_general (dominio,codigo,valor,descripcion,activo) VALUES
            (N'system',N'notification-emails-pending-companies',@emails,N'notification emails pending for companies',1);
        PRINT 'Inserted system - notification-emails-pending-companies';
    END
GO